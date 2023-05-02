package co.edu.campusucc.poo.classes;

import co.edu.campusucc.poo.abstr.Plane;

public class BigEngine extends Plane {
    public BigEngine() {
        super();
        
}

    @Override
    public void turnOnEngine() {
        for (int i = 0; i < 8; i++) {
            System.out.println(" 🕜 Starting Engine ✨");
            try {
                Thread.sleep(500-(i*40));
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }
        }
        System.out.println("Plane " + getReference() + " has started correctly 🚀");
       
    }

    @Override
    public void turnOffEngine() {
        for (int i = 0; i < 10; i++) {

            System.out.println(" ⬇️ Shutting down Engine 📉 ");
               try {
                   Thread.sleep(20+(i*50));
               } catch (InterruptedException e) {
                  
                   e.printStackTrace();
               }
           }
           System.out.println("Plane "+ getReference() + " has turned off correctly 📴");
    }

    @Override
    public void speedUp() {
        for (int i = 0; i <= 12; i++) {
        
            System.out.println("La potencia actual es de "+ getCurrentPower());
            setCurrentPower(i*8);

            try {
                Thread.sleep((1500)-(i*70));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Current Speed: " + super.getCurrentSpeed() + " Kilometros / Hora" );
               setCurrentSpeed(getCurrentSpeed()+(i*20));

               System.out.println("La Actitud actual es de "+ getCurrentAltitud() + " Metros");
               setCurrentAltitud(i*3000);

               System.out.println();
        }

        

        
    }

    @Override
    public void expose() {
        
        System.out.println("Estas Volando en el Avion " + super.getType() + " de la marca " + super.getBrand());
        System.out.println("Maxima altura permitida : 20.000 ft "     );
    }
    
}