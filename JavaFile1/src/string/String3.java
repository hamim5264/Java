/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
public class String3 {
    public static void main(String[] args) {
        String country = "   Bangladesh is my country   ";
        System.out.println(country);
        
        char ch = country.charAt(0);
        System.out.println(ch);
        
        int value = country.codePointAt(0);
        System.out.println(value);
         int pos = country.indexOf("is");
         System.out.println(pos);
         
         pos = country.lastIndexOf("n");
         System.out.println(pos);
         
         String s3 = country.trim();
         System.out.println(s3);
    }
    
}
