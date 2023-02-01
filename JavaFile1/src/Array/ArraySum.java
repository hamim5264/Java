/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Win-10
 */
import java.util.Scanner;
public class ArraySum {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        double[] number  = new double [5];
        System.out.print("Enter five numbers: ");
        for (int i = 0; i <number.length; i++) {
            
            number[i]= input.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i <number.length; i++) {
            sum = sum + number[i];
            
        }
        double avg = sum/number.length;
        System.out.println("Sum = "+sum);
        System.out.println("Aevrage = "+avg);
    }
    
}
