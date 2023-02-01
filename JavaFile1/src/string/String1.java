/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
public class String1 {
    public static void main(String[] args) {
        String s1 = "Hamim Leon";
       String s2 = new String ("Hamim Leon");
       System.out.println("s1="+s1);
       System.out.println("s2="+s2);
       int len = s1.length();
       System.out.println("Length = "+len);
       if(s1.equalsIgnoreCase(s2)){
           System.out.println("Equals");
       }else
           System.out.println("Not equals");
       boolean con = s1.contains("Hamim");
       System.out.println(con);
       boolean b = s1.isEmpty();
       System.out.println(b);
    }
    
}
