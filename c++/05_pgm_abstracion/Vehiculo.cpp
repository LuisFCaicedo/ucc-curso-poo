#include <iostream>
#include <string>
#include <chrono>
#include <thread>

using namespace std;

class Vehiculo {
private:
    string brand;
    string type;
    string chassis;
    int currentSpeed;
    string emojisSpeed = "Speed Indicator: ";

public:
    // Constructor
    Vehiculo() {}

    // Getters & Setters
    string getBrand() {
        return brand;
    }
    string getChassis() {
        return chassis;
    }
    string getType() {
        return type;
    }
    int getCurrentSpeed() {
        return currentSpeed;
    }
    void setBrand(string brand) {
        this->brand = brand;
    }
    void setChassis(string chassis) {
        this->chassis = chassis;
    }
    void setType(string type) {
        this->type = type;
    }
    void setCurrentSpeed(int currentSpeed) {
        this->currentSpeed = currentSpeed;
    }

    // to String method
    string toString() {
        return "Abtrac class -> Vehiculo";
    }

    // abstract behavior
    virtual void turnOnEngine() = 0;
    virtual void turnOffEngine() = 0;

    // defined behavior
    void parking() {
        for (int i = 0; i < 20; i++) {
            cout << " 🚥 Parking 🚥" << endl;
            this_thread::sleep_for(chrono::milliseconds((800) - (i * 50)));
        }
    }

    void breaking() {
        for (int i = 0; i <= 8; i++) {
            cout << "Breaking 🛑" << endl;
            this_thread::sleep_for(chrono::milliseconds(20 + (i * 50)));
            currentSpeed = currentSpeed - 1;
            emojisSpeed = emojisSpeed.substr(0, emojisSpeed.length() - 1);
            cout << emojisSpeed << endl;
        }
        cout << "Vehiculo detenido" << endl;
        cout << "Velocidad Actual del vehiculo: " << getCurrentSpeed() << endl;
    }

    void speedUp() {
        for (int i = 0; i <= 10; i++) {
            emojisSpeed += "➡️";
            cout << "📈Speeding Up" << emojisSpeed << endl;

            this_thread::sleep_for(chrono::milliseconds((1000) - (i * 90)));
            currentSpeed = currentSpeed + 1;
        }
    }

    void showCurrentSpeed() {
        cout << getCurrentSpeed() << endl;
    }

    string getEmojisSpeed() {
        return emojisSpeed;
    }

    void setEmojisSpeed(string emojisSpeed) {
        this->emojisSpeed = emojisSpeed;
    }
};