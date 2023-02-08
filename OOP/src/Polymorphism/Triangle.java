/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Win-10
 */
public class Triangle extends Shape {
    double base, height;
    Triangle( double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double area (){
        System.out.print("Area of shape: ");
        return 05.*base*height;
    }
    
}
