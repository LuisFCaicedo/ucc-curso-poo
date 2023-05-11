#include <iostream>
#include <string>
#include <chrono>
#include <thread>
#include "TipoComercial.cpp"
#include "Avion.cpp"

using namespace std;
class MainAirships : public Avion {
public:
//int main() {

    Avion* avion = new TipoComercial();
    avion->setMarca("Boeing");
    avion->setTipo("Comercial");
    std::cout << avion << std::endl;

    avion->startingEngine();
    avion->speedUp();
    avion->descent();
    avion->currentSpeed();
    avion->landing();
    avion->stopingEngine();

    avion = new TipoCarga();
    avion->setMarca("Airbus");
    avion->setTipo("Carga");
    std::cout << avion << std::endl;

    avion->startingEngine();
    avion->speedUp();
    avion->speedUp();
    avion->currentSpeed();
    avion->descent();
    avion->descent();
    avion->landing();
    avion->stopingEngine();

    avion = new TipoMilitar();
    avion->setMarca("Lockheed Martin");
    avion->setTipo("Aereonave de Combate");
    std::cout << avion << std::endl;

    avion->startingEngine();
    avion->speedUp();
    avion->speedUp();
    avion->currentSpeed();
    avion->shootMissiles();
    avion->descent();
    avion->descent();
    avion->landing();
    avion->stopingEngine();

    avion = new TipoAvioneta();
    avion->setMarca("Tecnam P2002 Sierra Mk2");
    avion->setTipo("Avion de Agricultura");
    std::cout << avion << std::endl;

    avion->startingEngine();
    avion->speedUp
}