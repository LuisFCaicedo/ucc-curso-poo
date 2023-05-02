package co.edu.campusucc.poo.inter;

import java.util.Scanner;
import co.edu.campusucc.poo.core.EngineInvoice;

public class Interfaz {
    
    EngineInvoice engineInvoice = new EngineInvoice();

    public void StartinigUi() {
        Scanner input = new Scanner(System.in);

        int option = 0;
        while (option != 4) {
            System.out.println("Bienvenido a CITY FRUIT STORE");
            System.out.println("Ingresa por favor la opcion que quieras");
            System.out.println("1. Generar factura");
            System.out.println("2. Añadir Cliente");
            System.out.println("3. Añadir Producto");
            System.out.println("4. Salir");

            option = input.nextInt();
            input.nextLine();

            switch(option){
                case 1:
                    engineInvoice.createBill();
                    break;
                case 2:
                    engineInvoice.addClient();
                    break;
                case 3:
                    engineInvoice.addProduct();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar FRUIT STORE");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intentalo de nuevo");
                    break;
            }
        }


        

        
    }

    public Interfaz() {
        
    }

}

    
