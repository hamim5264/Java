/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafile1;

/**
 *
 * @author Win-10
 */
import java.util.Scanner;
public class Area {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        //triangle area
        double base, height,area;
        System.out.print("Enter base: ");
        base = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Area = "+area);
        
        //circle area
        double radius;
        double area2;
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        area2 = 3.1416*radius*radius;
        System.out.print("Area of circle = "+area2);
    }
    
}
