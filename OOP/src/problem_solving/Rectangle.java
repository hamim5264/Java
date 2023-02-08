/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem_solving;

/**
 *
 * @author Win-10
 */
public class Rectangle extends Shape{
    Rectangle (double d1, double d2){
        super(d1,d2);
    }
    void area (){
        double result = d1 * d2;
        System.out.println("Area = "+result);
    }
}
