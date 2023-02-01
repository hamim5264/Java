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
public class PrimeNumber {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int i,num,count=0;
        System.out.print("Enter any positive number: ");
        num = input.nextInt();
        for(i=2; i<=num; i++){
            if(num%i==0){
                count++;
                break;
            }
        }if(count==0){
            System.out.print("Prime number");
        }else{
            System.out.print("Not a prime number");
        }
    }
    
}
