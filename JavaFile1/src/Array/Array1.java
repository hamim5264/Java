/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Win-10
 */
public class Array1 {
    public static void main (String[] args){
        int [] number = new int [5];
        number [0] = 10;
        number [1] = 15;
        number [2] = 30;
        number [3] = 40;
        number [4] = 60;
        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Sum ="+sum);
        int len = number.length;
        System.out.println(len);
    }
    
}
