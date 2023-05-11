#include <iostream>
#include <string>
#include <chrono>
#include <thread>
#include "Tesla.cpp"

using namespace std;

int main() {

    Vehiculo* tesla = new Tesla();
    cout << tesla->getBrand() << endl;
    cout << tesla->getChassis() << endl;
    cout << tesla->getType() << endl;

    tesla->turnOnEngine();
    tesla->speedUp();
    tesla->breaking();
    tesla->speedUp();
    tesla->breaking();
    tesla->turnOffEngine();

    delete tesla;
    return 0;
}
