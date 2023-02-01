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
public class DoubleInput {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double d;
        System.out.print("Enter any double number: ");
        d = input.nextDouble();
        System.out.println("Double number is: "+d);
    }
    
}
