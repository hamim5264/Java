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
public class Capital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter: ");
        ch= input.next().charAt(0);
        if (ch>='a' && ch <='z')
            System.out.print("Small letter");
        else if (ch>='A' && ch<='Z')
            System.out.print("Capital letter");
        else
            System.out.print("Not a letter");
        
    }
    
}
