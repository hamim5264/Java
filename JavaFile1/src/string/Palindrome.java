/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
public class Palindrome {
   public static void main (String[] args){
       String s1 = "121";
       StringBuffer sb = new StringBuffer(s1);
       sb.reverse();
       
           if(s1.equals(sb)){
               System.out.print("Palindrome");
           }else {
               System.out.print("Not a palindrome");
           }
       }
           
   }
    

