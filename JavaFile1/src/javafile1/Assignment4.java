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
public class Assignment4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int phonePrice = 1800;
        int NumberOfInstallment, InstallmentPerMonth;
        System.out.println("Number of isntallment: ");
        NumberOfInstallment = input.nextInt();
        InstallmentPerMonth = phonePrice/NumberOfInstallment;
        System.out.println("Monthly installment amount = "+InstallmentPerMonth);
    }
}
