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
public class Temp {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double fah,cel;
        System.out.print("Enter Cel: ");
        cel = input.nextDouble();
        fah = 1.8*cel+32;
        System.out.println("Fah = "+fah);
       
        System.out.print("Enter fah: ");
        fah = input.nextDouble();
        cel = 0.5*fah-32;
        System.out.print("Cel = "+cel);
    }
    
}
