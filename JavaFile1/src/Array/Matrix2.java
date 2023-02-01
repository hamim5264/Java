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
public class Matrix2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int [][]A = new int [2][3];
        int [][]B = new int [2][3];
        //getting input for A matrix
        System.out.println("Enter elements for A matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ",row,col, args);
                A [row][col] = input.nextInt();
                
            }
            
        }
        //getting input for B matrix
        System.out.println("Enter elements for B matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ",row,col, args);
                B [row][col] = input.nextInt();
                
            }
            
        }
        //printing  A matrix
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+A[row][col]);
                
            }
            System.out.println();
            
        }
        //printing  B matrix
        System.out.println("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+B[row][col]);
                
            }
            System.out.println();
            
        }
    }
    
}
