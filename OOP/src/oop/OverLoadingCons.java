/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
public class OverLoadingCons {
    String name, gender;
    int phone;
    OverLoadingCons(){
        System.out.println("No Value");
    }
    OverLoadingCons (String st, String gd){
        name = st;
        gender = gd;
    }
    OverLoadingCons (String st, String gd, int ph){
        name= st;
        gender = gd;
        phone = ph;
    }
    void printinfo (){
        System.out.println("Name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("phone: "+phone);
        System.out.println("\n");
    }
    
}
