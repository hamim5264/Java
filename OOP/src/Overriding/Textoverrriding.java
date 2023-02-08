/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Win-10
 */
public class Textoverrriding {
    public static void main(String[] args) {
        Teacher t1 = new Teacher ();
        t1.name = "Hamim";
        t1.age = 21;
        t1.quali= "BSc in CSE";
        t1.printinfo();
        
        Person p1 = new Person ();
        p1.name = "Lija";
        p1.age = 30;
        p1.printinfo();
    }
    
}
