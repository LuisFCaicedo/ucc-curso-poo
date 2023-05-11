#include <iostream>
#include <string>
#include <thread>
#include <chrono>

class Avion {
public:
    Avion() {}
    std::string toString() {
        return "Clase Abstracta--> Avion: " + getMarca() + " " + getTipo() + " ";
    }
    virtual void startingEngine() = 0;
    virtual void stopingEngine() = 0;
    void speedUp() {
        std::string speedUpString = "SpeedUp in progres: ";
        for (int i = 0; i < velocidad; i++) {
            speedUpString += "🛫";
        }
        for (int i = 0; i < 10; i++) {
            speedUpString += "🛫";
            std::cout << speedUpString << std::endl;
            try {
                std::this_thread::sleep_for(std::chrono::milliseconds(1000 - (i * 50)));
            } catch (std::exception& e) {
                std::cerr << "⛔:" << e.what() << std::endl;
            }
        }
        addSpeed(10);
    }
    void currentSpeed() {
        std::cout << "Current Speed 🛫: " << getVelocidad() << std::endl;
    }
    void landing() {
        for (int i = 0; i < 5; i++) {
            std::cout << "🛬🛬 Landing in Prog" << std::endl;
            try {
                std::this_thread::sleep_for(std::chrono::milliseconds(1000));
            } catch (std::exception& e) {
                std::cerr << "⛔:" << e.what() << std::endl;
            }
        }
        setVelocidad(0);
    }
protected:
    int addSpeed(int velocidad) {
        setVelocidad(this->velocidad + velocidad);
        return getVelocidad();
    }
    int downSpeed(int velocidad) {
        setVelocidad(this->velocidad - velocidad);
        return getVelocidad();
    }
    int getVelocidad() {
        return velocidad;
    }
    void setVelocidad(int velocidad) {
        this->velocidad = velocidad;
    }
    std::string getMarca() {
        return marca;
    }
    void setMarca(std::string marca) {
        this->marca = marca;
    }
    std::string getTipo() {
        return tipo;
    }
    void setTipo(std::string tipo) {
        this->tipo = tipo;
    }
private:
    std::string marca;
    std::string tipo;
    int velocidad;
};