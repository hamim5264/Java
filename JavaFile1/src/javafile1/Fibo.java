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
public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("How many numbers: ");
        int n = input.nextInt();
        int first = 0;
        int secound = 1;
        int fibo ;
        System.out.print(first+" "+secound);
        for (int i=3; i<=n; i++){
            fibo = first + secound;
            System.out.print(" "+fibo);
            first = secound;
            secound = fibo;
        }
        System.out.println();
    }
    
}
