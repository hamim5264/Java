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
public class Factorial {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        int i,n, fact=1;
        System.out.print("Enter any positive intezer: ");
        n = input.nextInt();
        for(i=n; i>=1; i--){
            fact = fact *i;
        }
        System.out.println("Factorial of "+n+"="+fact);
    }
    
}
