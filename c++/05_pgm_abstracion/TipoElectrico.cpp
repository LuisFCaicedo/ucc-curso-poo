#include <iostream>
#include <thread>
#include "Vehiculo.cpp"

using namespace std;

class TipoElectrico : public Vehiculo {

public:
    TipoElectrico() {
        setType("Electric");
    }

    void turnOnEngine() {
        for (int i = 0; i < 8; i++) {
            cout << " 🕜 Starting Engine ✨" << endl;
            this_thread::sleep_for(chrono::milliseconds(500 - (i * 40)));
        }
        cout << "Vehicule has started correctly 🚀" << endl;
    }

    void turnOffEngine() {
        for (int i = 0; i < 10; i++) {
            cout << " ⬇️ Shutting down Engine 📉 " << endl;
            this_thread::sleep_for(chrono::milliseconds(20 + (i * 50)));
        }
        cout << "Vehicule has turned off correctly 📴" << endl;
    }

    void speedUp() {
        for (int i = 0; i <= 10; i++) {
            setEmojisSpeed(getEmojisSpeed() + "➡️");
            cout << "📈Speeding Up" << getEmojisSpeed() << endl;
            this_thread::sleep_for(chrono::milliseconds(1000 - (i * 100)));
            setCurrentSpeed(getCurrentSpeed() + 1);
        }
    }

    string toString() {
        return "Vehiculo";
    }
};