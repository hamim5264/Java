/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.HashSet;

/**
 *
 * @author Win-10
 */
public class HashSetDemo {
    public static void main (String[] args){
        HashSet<String> fruits = new HashSet<String> ();
                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Strawbeery");
                fruits.add("jackfruite");
                System.out.println(fruits);
                System.out.println(fruits.size());
    }
    
}
