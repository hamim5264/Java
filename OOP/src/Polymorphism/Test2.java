/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Win-10
 */
public class Test2 {
    public static void main(String[] args) {
        Shape s = new Shape ();
        Rectangle r = new Rectangle (10,20);
        Triangle t = new Triangle (20,30);
        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
    }
}
