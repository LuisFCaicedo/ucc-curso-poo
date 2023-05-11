#include "TipoElectrico.cpp"

class Tesla : public TipoElectrico {
public:
    Tesla() : TipoElectrico() {
        setBrand("Tesla");
        setType("Electrico");
        setChassis("Model S");
    }
};