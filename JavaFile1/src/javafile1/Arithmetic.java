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
public class Arithmetic {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
       
        System.out.println("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        num2 = input.nextInt();
        result = num1+num2;
        System.out.println("Sum= "+result);
        
        result = num1-num2;
        System.out.println("Sub= "+result);
        
        result = num1*num2;
        System.out.println("Mul= "+result);
        
        double result2 = (double)num1/num2;
        System.out.println("Dev= "+result2);
        
        result = num1%num2;
        System.out.println("Rem= "+result);
    }
    
}
