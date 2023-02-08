/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
import java.util.HashMap;
public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> customer = new HashMap<Integer, String>();
        customer.put(101, "Hamim");
        customer.put(102, "Lima");
        customer.put(103, "Lija");
        
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
    }
    
   
    
}
