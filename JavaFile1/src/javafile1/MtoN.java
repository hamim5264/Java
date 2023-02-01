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
public class MtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,m,n,sum=0;
        System.out.print("Enter first number: ");
        m = input.nextInt();
        System.out.print("Enter last number: ");
        n = input.nextInt();
        for (i=m; i<=n; i++)
            sum = sum+i;
        System.out.print("Sum is: "+sum);
            
    }
    
}
