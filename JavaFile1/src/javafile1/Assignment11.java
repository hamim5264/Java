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
public class Assignment11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter how many numbers: ");
        int n = input.nextInt();
        int first = 0;
        int secound = 1;
        int fibo = 0;
        for (int i =3; i<=n; i++){
            fibo = first + secound;
            first = secound;
            secound = fibo;
            
        }
        System.out.println("Fibo number is: "+fibo);
        
    }
    
}
