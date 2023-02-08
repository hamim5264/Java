/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exhandeling;

/**
 *
 * @author Win-10
 */
public class handeling {
    public static void main(String[] args) {
        
   
    try {
    int a[] = new int [4];
    a[4]=10;
}catch(ArithmeticException e1){
    System.out.println("Exception: "+e1);
}catch (Exception e2){
    System.out.println("Exception: "+e2);
} finally {
        System.out.println("Last line of the program");
    }
    
}
}
