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
public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch ;
        System.out.println("Do you love java? (amswer shoud be y,Y,n,N)");
                ch= input.next().charAt(0);
        if (ch=='y' || ch=='Y')
            System.out.print("You are a java lover");
        else if (ch=='n' ||ch=='N')
            System.out.print("You are not a java lover");
        
    }
    
}
