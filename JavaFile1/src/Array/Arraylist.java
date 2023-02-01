/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Win-10
 */

import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
    for(int X:number){
        System.out.println(" "+X);
    }
        System.out.println("Size ="+number.size());
        
    }
}
