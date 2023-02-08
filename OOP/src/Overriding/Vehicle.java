/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Win-10
 */
public class Vehicle {
    String color;
    double weight;
    Vehicle (String c, double w){
        color = c;
        weight = w;
    }
    void attribute (){
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }
    
}
