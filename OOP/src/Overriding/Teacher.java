/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Win-10
 */
public class Teacher extends Person {
    String quali;
    @Override
    void printinfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+quali);
        
    }
}
