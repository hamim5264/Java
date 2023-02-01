/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
public class MethodT2 {
    public static void main(String[] args) {
        Teacher2 th1 = new Teacher2 ();
        th1.name = "Hamim";
        th1.gender = "Male";
        th1.phone = 1724879284;
        th1.printinfo();
       
        System.out.print("\n\n");
        
        Teacher2 th2 = new Teacher2 ();
        th2.name = "Anisul";
        th2.gender = "Male";
        th2.phone = 1752464668;
        th2.printinfo();
        
        System.out.print("\n\n");
        
        Teacher2 th3 = new Teacher2 ();
        th3.name = "Shahina";
        th3.gender = "Female";
        th3.phone = 1754665812;
        th3.printinfo();
    }
    
}
