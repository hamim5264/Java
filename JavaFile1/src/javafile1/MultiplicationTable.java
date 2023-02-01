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
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,m,n;
        System.out.print("Enter initial value: ");
        m = input.nextInt();
        System.out.print("Enter final value: ");
        n = input.nextInt();
        for(i=m; i<=n; i++){
            for (j=1; j<=10; j++){
                System.out.print(i+"X"+j+ "=" +i*j);
            }
            System.out.print("\n\n");
        } 
    }
    
}
