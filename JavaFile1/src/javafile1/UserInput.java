/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafile1;
import java.util.Scanner;

/**
 *
 * @author Win-10
 */
public class UserInput {
    public static void main (String[] args){
      Scanner input = new Scanner (System.in);
      int number;
      System.out.print("Enter any number:");
      number  = input.nextInt();
      System.out.print("number="+number);
    }
    
}
