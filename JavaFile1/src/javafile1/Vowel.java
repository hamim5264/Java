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
public class Vowel {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        char ch;
        System.out.print("Enter any character: ");
        ch = input.next().charAt(0);
        if(ch=='a')
            System.out.print("Vowel");
        else if (ch=='e')
            System.out.print("Vowel");
        else if (ch=='i')
            System.out.print("Vowel");
        else if (ch=='o')
            System.out.print("Vowel");
        else if (ch=='u')
            System.out.print("Vowel");
        else if (ch=='A')
            System.out.print("Vowel");
        else if (ch=='E')
            System.out.print("Vowel");
        else if (ch=='I')
            System.out.print("Vowel");
        else if (ch=='O')
            System.out.print("Vowel");
        else if (ch=='U')
            System.out.print("Vowel");
        else 
            System.out.print("Consonant");
                
    }
    
}
