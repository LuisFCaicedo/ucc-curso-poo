#include <iostream>
#include "Vehiculo.cpp"

using namespace std;

class TipoCombustion : public Vehiculo {
public:
    void turnOnEngine() override {
        for (int i = 0; i < 8; i++) {
            cout << " 🕜 Starting Engine ✨" << endl;
            try {
                std::this_thread::sleep_for(std::chrono::milliseconds(500-(i*40)));
            } catch (const std::exception& e) {
                cout << e.what() << endl;
            }
        }
        cout << "Vehicule has started correctly 🚀" << endl;
    }

    void turnOffEngine() override {
        for (int i = 0; i < 10; i++) {
            cout << " ⬇️ Shutting down Engine 📉 " << endl;
            try {
                std::this_thread::sleep_for(std::chrono::milliseconds(20+(i*50)));
            } catch (const std::exception& e) {
                cout << e.what() << endl;
            }
        }
        cout << "Vehicule has turned off correctly 📴" << endl;
    }
    
    string toString() override {
        return "Vehiculo";
    }
};