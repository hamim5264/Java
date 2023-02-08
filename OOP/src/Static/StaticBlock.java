/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static;

/**
 *
 * @author Win-10
 */
public class StaticBlock {
    static int id;
    static String name;
    static {
        id = 101;
        name = "hamim";
    }

    
    static void display (){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        StaticBlock.display();
    }
    
}
