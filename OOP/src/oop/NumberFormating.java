/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.text.DecimalFormat;

/**
 *
 * @author Win-10
 */
public class NumberFormating {
    public static void main(String[] args) {
        DecimalFormat ob = new DecimalFormat ("0.00");
        double x = 2.454879;
        System.out.println("x="+ob.format(x));
        
        
    }
    
}
