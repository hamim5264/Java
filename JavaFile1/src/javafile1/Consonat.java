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
public class Consonat {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        char ch;
        System.out.print("Enter any Character: ");
        ch = input.next().charAt(0);
        if (ch== 'a' || ch == 'e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E'
                || ch == 'I' ||ch == 'O' ||ch=='U')
            System.out.print("Vowel");
        else
            System.out.print("Consonant");
    }
    
    
}
