/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
public class wrapping {
    public static void main(String[] args) {
        int x= 30;
        //premitive to obeject
        Integer y= Integer.valueOf(x);
        System.out.println("y="+y);
        
        Integer z= x; //autoboxing
        System.out.println("z="+z);
        
        //object ot premitive
        Double d= new Double (10.5);
        System.out.println("d="+d);
        
        double e =d; //d.doubelValue();
        System.out.println("e="+d);
        
    }
}
