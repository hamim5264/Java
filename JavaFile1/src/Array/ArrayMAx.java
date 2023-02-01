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
public class ArrayMAx {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        double [] number = new double [5];
        System.out.print("Enter five numbers: ");
        for (int i = 0; i <number.length; i++) {
            number[i] = input.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i <number.length; i++) {
            sum = sum+number[i];
        }
        System.out.println("Sum = "+sum);
        double avg = sum /number.length;
        System.out.println("Avg = "+avg);
        
        double max = number[0];
        double min = number[0];
        for (int i = 1; i <number.length; i++) {
            if (max<number[i]){
                max = number[i];
            }
            if (min>number[i]){
                min = number[i];
            }
            
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
    
}
