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
public class Armstrong {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num,r,sum=0,temp;
        System.out.print("Enter any number: ");
        num = input.nextInt();
        temp = num;
        while(temp!=0){
           r= temp%10;
           sum = sum + r*r*r;
           temp = temp/10;
        }
        if (sum==num){
            System.out.print("Armstromg number");
            
        }
        else
            System.out.print("Not Armstrong");
    }
    
}
