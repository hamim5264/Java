/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Win-10
 */
public class Thiskey {
    String name;
    String haircol;
    int age;
    Thiskey (String name, int age){
        this.name = name;
        this.age = age;
    }
    Thiskey (String name, int age, String haircol){
        this(name, age);
        this.haircol = haircol;
    }
    void print (){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Haircolor: "+haircol);
    }
    
}
