from Avion import Avion
from TipoComercial import TipoComercial
from TipoCarga import TipoCarga
from TipoMilitar import TipoMilitar
from TipoAvioneta import TipoAvioneta

avion = TipoComercial()
avion.setMarca("Boeing")
avion.setTipo("Comercial")
print(avion)

avion.startingEngine()
avion.speedUp()
avion.descent()
avion.currentSpeed()
avion.landing()
avion.stopingEngine()

avion = TipoCarga()
avion.setMarca("Airbus")
avion.setTipo("Carga")
print(avion)

avion.startingEngine()
avion.speedUp()
avion.speedUp()
avion.currentSpeed()
avion.descent()
avion.descent()
avion.landing()
avion.stopingEngine()

avion = TipoMilitar()
avion.setMarca("Lockheed Martin")
avion.setTipo("Aereonave de Combate")
print(avion)

avion.startingEngine()
avion.speedUp()
avion.speedUp()
avion.currentSpeed()
avion.shootMissiles()
avion.descent()
avion.descent()
avion.landing()
avion.stopingEngine()

avion = TipoAvioneta()
avion.setMarca("Tecnam P2002 Sierra Mk2")
avion.setTipo("Avion de Agricultura")
print(avion)

avion.startingEngine()
avion.speedUp()
avion.speedUp()
avion.currentSpeed()
avion.irrigation()
avion.descent()
avion.descent()
avion.landing()
avion.stopingEngine()