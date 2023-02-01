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
public class Assignment6 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int num;
        System.out.print("Enter any digit: ");
        num = input.nextInt();      
        if (num==0)
            System.out.print("Zero");
        else if (num==1)
            System.out.print("One");
        else if (num==2)
            System.out.print("Two");
        else if (num==3)
            System.out.print("Three");
        else if (num==4)
            System.out.print("Four");
        else if (num==5)
            System.out.print("Five");
        else if (num==6)
            System.out.print("Six");
        else if (num==7)
            System.out.print("Seven");
        else if (num==8)
            System.out.print("Eight");
        else if (num==9)
            System.out.print("Nine");
        
    }
    
}
