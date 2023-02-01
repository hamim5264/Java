/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
public class Default {
    String name, gender;
    int phone;


    void Default(){
        System.out.println("No Value");
    }
    void Default (String st, String gd, int ph){
        name =st;
        gender = gd;
        phone = ph;
    }
    void printinfo (){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println("\n\n");
    }
    
}
