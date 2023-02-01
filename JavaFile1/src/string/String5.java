/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
public class String5 {
    public static void main(String[] args) {
        
        //premitive to string
        double d= 100.5;
        String st = Double.toString(d);
        System.out.println(st);
        
        //String to premitive
        String s1 = "15";
        int  i = Integer.parseInt(s1);
        System.out.println("i="+i);
        
        String s2 = "52";
        double p= Double.parseDouble(s2);
        System.out.println("p="+p);
        
    }
    
}
