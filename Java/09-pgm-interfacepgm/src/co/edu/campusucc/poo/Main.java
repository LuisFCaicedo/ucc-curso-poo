package co.edu.campusucc.poo;

import co.edu.campusucc.poo.abstr.Plane;
import co.edu.campusucc.poo.instances.AirbusBig;
import co.edu.campusucc.poo.instances.Cessna;
import co.edu.campusucc.poo.instances.Jet;
import co.edu.campusucc.poo.instances.Jumbo;


public class Main{

    public static void main(String[] args) {
       
        

        Plane A180 = new Jumbo();

        System.out.println("+--------------------------+");
        A180.expose();
        System.out.println("+--------------------------+");
        A180.turnOnEngine();
        A180.speedUp();
        A180.slowDown();
        A180.turnOffEngine();
        
         
        System.out.println();

         
        Plane Eclipse600 = new Jet();

        System.out.println("+--------------------------+");
        Eclipse600.expose();
        System.out.println("+--------------------------+");
         Eclipse600.turnOnEngine();
         Eclipse600.speedUp();
         Eclipse600.slowDown();
         Eclipse600.turnOffEngine();

          


          
         Plane cessna = new Cessna();
         System.out.println("+--------------------------+");
         cessna.expose();
         System.out.println("+--------------------------+");
          cessna.turnOnEngine();
          cessna.speedUp();
          cessna.slowDown();
          cessna.turnOffEngine();

           

           
          Plane Airbus = new AirbusBig();
          System.out.println("+--------------------------+");
          Airbus.expose();
          System.out.println("+--------------------------+");
           Airbus.turnOnEngine();
           Airbus.speedUp();
           Airbus.slowDown();
           Airbus.turnOffEngine();

            
         

            // All planes tested correctly


     
    }



}
