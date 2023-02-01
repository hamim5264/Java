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
public class EvenOdd {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("enter any positive number: ");
        num = input.nextInt();
        if(num%2==0)
            System.out.print("Even number");
        else if (num%2!=0)
            System.out.print("Odd number");
        else
            System.out.print("Not a valid number");
                    
    }
    
}
