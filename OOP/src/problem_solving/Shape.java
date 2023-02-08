/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem_solving;

/**
 *
 * @author Win-10
 */
public abstract class Shape {
    
    double d1, d2;
    Shape (double d1, double d2){
        this.d1 = d1;
        this.d2 = d2;
    }
    abstract void area ();
}
