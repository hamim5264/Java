/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
public class Paramitre {
    String name, gender;
    int phone;
    void mainifo(String st,String gd, int ph){
        name =st;
        gender = gd;
        phone =ph;
    }
    void printinfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.print("\n\n");
    }
    
}
