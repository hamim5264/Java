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
public class Assignment3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); 
        double id;
        String title;
        double price;
        String des;
        String cat;
        System.out.print("Enter Id: ");
        id = input.nextDouble();
        System.out.println("Id: "+id);
        System.out.print("Enter title: ");
        title = input.nextLine();
        System.out.println("Title: "+title);
        System.out.print("Enter price: ");
        price = input.nextDouble();
        System.out.println("Price: "+price);
        System.out.print("Enter description: ");
        des = input.nextLine();
        System.out.println("Description: "+des);
        System.out.print("Enter category: ");
        cat = input.nextLine();
        System.out.println("Category: "+cat);
    }
    
}
