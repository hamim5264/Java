/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
import java.util.Scanner;
public class Numberconvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        int decimal;
        decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
        String Hex = Integer.toHexString(decimal);
        System.out.println(Hex);
    }
    
}
