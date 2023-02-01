/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statickeyword;

/**
 *
 * @author Win-10
 */
public class Student {
    String name;
    int id;
    static String versity ="DIU";
    
    Student (String nm, int i){
        name = nm;
        id = i;
    }
    void printinfo (){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Versity: "+versity);
        System.out.println("\n");
    }
    
}
