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
public class Matrix4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]A = new int [3][3];
        int sumdig = 0;
        int sumup= 0;
        int sumlw=0;
        System.out.println("Enter elemetns for A matrix:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]= ",row,col, args);
                        
                A[row][col] = input.nextInt();
            }
            
        }
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if(row==col){
                        sumdig = sumdig+A[row][col];
                    }
                    if(row<col){
                        sumup = sumup+A[row][col];
                    }
                    if(row>col){
                        sumlw = sumlw+A[row][col];
                    }
                    
                }
        }
            System.out.println("Sum of diagonal: "+sumdig);
                System.out.println("Sum of upper: "+sumup);
                System.out.println("Sum of lower: "+sumlw);
    }
    
}
