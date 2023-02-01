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
public class CharInput {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter Your Name: ");
        name = input.nextLine();
        System.out.println("Welcome: "+name);
    }
    
}
