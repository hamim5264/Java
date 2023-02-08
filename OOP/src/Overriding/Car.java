/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Win-10
 */
public class Car extends Vehicle {
    int gear ;
    Car (String c, double w, int g){
        super(c,w);
        gear =g;
    }
    @Override
    void attribute (){
       super.attribute();
        System.out.println("Gear: "+gear);
    }
    
}
