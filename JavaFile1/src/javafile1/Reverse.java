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
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0,r,temp;
        System.out.print("Enter some digit: ");
        num = input.nextInt();
        temp = num;
        while(temp!=0){
            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;
        }
        System.out.println("revers of your number: "+sum);
    }
    
}
