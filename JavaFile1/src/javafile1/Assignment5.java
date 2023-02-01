/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafile1;

/**
 *
 * voter validity
 */
import java.util.Scanner;
public class Assignment5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        if (age>=18)
                System.out.print("Valid Voter");
                else
                System.out.print("Invild voter");
        
        
    }
}
