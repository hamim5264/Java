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
public class MulSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,i, result=1;
        System.out.print("Enter the last number: ");
        n = input.nextInt();
        for(i=1; i<=n; i++)
        {
            System.out.print(i+" ");
            result = result*i;
        }
        System.out.print(" ");
        System.out.print("Sum = "+result);
    }
    
}
