/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Win-10
 */
public class Rectangle extends Shape {
    double length, width;
    Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double area (){
        System.out.print("Area of shape: ");
        return length * width;
    }
}
