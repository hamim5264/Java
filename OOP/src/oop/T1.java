/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
public class T1 {
    public static void main(String[] args) {
        Teacher th = new Teacher ();
        th.name = "Abdul Hamim";
        th.gender = "Male";
        th.phone = 1724879284;
        System.out.println("Name: "+th.name);
        System.out.println("Gender: "+th.gender);
        System.out.println("Phone: "+th.phone);
        
        Teacher th2 = new Teacher ();
        th2.name = "Anisul Islam";
        th2.gender = "Male";
        th2.phone = 1724884656;
        
        System.out.println("Name: "+th2.name);
        System.out.println("Gender: "+th2.gender);
        System.out.println("Phone: "+th2.phone);
    }
    
}
