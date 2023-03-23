package co.edu.campusucc.poo;

import java.util.Random;

import co.edu.campusucc.poo.domain.ThereadExtends;

public class MainThreadExtends{
    public static void main(String[] args) {
     
        ThereadExtends thread = new ThereadExtends();
        thread.setTimes(new Random().nextInt(50));
        thread.start();
    } 
        
    

}