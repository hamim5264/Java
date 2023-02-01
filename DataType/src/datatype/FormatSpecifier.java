/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatype;

/**
 *
 * @author Win-10
 */
public class FormatSpecifier {
    public static void main (String[] args){
        boolean b =true;
        char c ='c';
        short s = 245;
        int i = 45;
        float f = 45.56f;
        double d = 44.666;
        
        System.out.printf("boolen b = %b\n", b);
        System.out.printf("charecter c = %c\n", c);
        System.out.printf("short s = %d\n", s);
        System.out.printf("integer i = %d\n", i);
        System.out.printf("float f = %f\n", f);
        System.out.printf("double d = %.2f\n", d);
    }
    
}
