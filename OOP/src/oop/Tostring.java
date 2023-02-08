/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
public class Tostring {
    String name;
    int age;
    Tostring(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\nage:"+age;
    }
    
}
