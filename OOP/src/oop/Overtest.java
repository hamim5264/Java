/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Win-10
 */
public class Overtest {
    public static void main(String[] args) {
        OverLoadingCons info = new OverLoadingCons ();
        info.printinfo();
        OverLoadingCons info2 = new OverLoadingCons ("Hamim", "Male");
        info2.printinfo();
        OverLoadingCons info3 = new OverLoadingCons ("Shahina", "Female", 1719865871);
        info3.printinfo();
    }
    
}
