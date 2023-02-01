/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
public class String2 {
    public static void main(String[] args) {
        String firstname = "Hamim";
        String lastname = " Leon";
        String fullname = firstname + lastname;
        System.out.println("FullName: "+fullname);
        
        String fullname1 = firstname.concat(lastname);
        System.out.println("fullname: "+fullname1);
        
        
        String uppercase = fullname1.toUpperCase();
        System.out.println(uppercase); 
        
        String lowercase = fullname1.toLowerCase();
        System.out.println(lowercase); 
        
        boolean b = firstname.startsWith("Ha");
        System.out.println("b="+b);
         boolean last = lastname.endsWith("on");
         System.out.println("last= "+last);
    }
}
