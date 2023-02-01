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
public class Assignment8 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        char ch,ch2;
        System.out.print("Have you completed your masters? (y/n) :");
        ch = input.next().charAt(0);
        System.out.print("Are you fluent in english? (y/n) :");
        ch2 = input.next().charAt(0);
        if (ch=='y' && ch2=='y')
            System.out.println("You ara eligeble for this job");
        else
            System.out.println("You are not eligeble for this job");
            
    }
    
}
