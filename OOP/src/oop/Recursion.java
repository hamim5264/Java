/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
public class Recursion {
    int fact (int n){
        if (n==1)
            return 1;
        else 
            return n*fact(n-1);
    }
    
}
