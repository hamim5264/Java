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
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter some digits: ");
        int num = input.nextInt();
        int sum =0, r, temp;
        temp = num;
        while(temp!=0){
            r = temp%10;
            sum = sum +r;
            temp= temp/10;
        }
        System.out.println("Sum of digits: "+sum);
            
    }
    
}
