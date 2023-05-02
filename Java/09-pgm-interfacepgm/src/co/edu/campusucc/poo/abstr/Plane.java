package co.edu.campusucc.poo.abstr;

import co.edu.campusucc.poo.intern.IBigEngine;
import co.edu.campusucc.poo.intern.IMediumEngine;
import co.edu.campusucc.poo.intern.IPlane;
import co.edu.campusucc.poo.intern.ISmallEngine;
import co.edu.campusucc.poo.intern.ISuperBigEgine;

public abstract class Plane implements IPlane, IBigEngine,ISuperBigEgine,IMediumEngine,ISmallEngine  {


    // Properties

    private String brand;
    private String type;
    private String reference;
    private int currentAltitud;
    private int currentSpeed;
    private int currentPower;

    // to String method

    public String toString(){
        return "Abtrac class -> Vehiculo";
    }


    // abstrac behavior

    @Override
    public abstract void turnOnEngine();

    @Override
    public abstract void turnOffEngine();
    @Override
    public abstract void speedUp();

    // defined behavior

    @Override
    public void parkaing() {
        for (int i = 0; i < 16; i++) {
            System.out.println(" 🚥 Parking 🚥");
            try {
                Thread.sleep((800)-(i*50));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public void slowDown() {
        for (int i = 0; i <= 8; i++) {
            System.out.println("✈️ Landing 🛑");
            try {
                Thread.sleep(20+(i*50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentSpeed=currentSpeed-(i*(currentSpeed/8));

            System.out.println("Current speed: " + currentSpeed);
        }
        
        System.out.println("Succesfully landing");
    
    }


    @Override
    public void showCurrentSpeed(){
        System.out.println(getCurrentSpeed());
    }


    // Constructor 

    protected Plane(){

    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getReference() {
        return reference;
    }


    public void setReference(String reference) {
        this.reference = reference;
    }


    public int getCurrentAltitud() {
        return currentAltitud;
    }


    public void setCurrentAltitud(int currentAltitud) {
        this.currentAltitud = currentAltitud;
    }


    public int getCurrentSpeed() {
        return currentSpeed;
    }


    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    public int getCurrentPower() {
        return currentPower;
    }


    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    // Getters & Setters

    
   
}
