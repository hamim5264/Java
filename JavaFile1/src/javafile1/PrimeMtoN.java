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
public class PrimeMtoN {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int i,j,m,n,count=0;
        System.out.print("Enter initial number: ");
        m = input.nextInt();
        System.out.print("Enter Final number: ");
        n = input.nextInt();
        for (i=m; i<=n; i++){
            for(j=2; j<=i-1; j++){
                if(i%j==0){
                    count ++;
                    break;
                }
            }
        }
        if (count==0)
            System.out.println(+i);
        count=0;
    }
    
}
