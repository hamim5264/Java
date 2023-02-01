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
public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i,n, sum=0;
        System.out.print("Enter the last number: ");
        n =input.nextInt();
        for(i=1; i<=n; i=i+1)
        {System.out.print(i+" ");
        sum = sum+i;
        }
        System.out.println(" ");
        System.out.println("Sum = "+sum);
        
    }
    
}
