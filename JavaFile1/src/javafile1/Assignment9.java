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
public class Assignment9 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Enter your option:\n1.Bengali\n2.Hindi\n3.Urdu\nOr others(English)");
        digit = input.nextInt();
        switch(digit){
            case 1:
                System.out.println("Selected language is Bengali");
                break;
            case 2:
                System.out.println("Selected language is Hindi");
                break;
            case 3:
                System.out.println("Selected language is Urdu");
                break;
            default:
                System.out.println   ("Selected language is English");
        }
        
    }
    
}
