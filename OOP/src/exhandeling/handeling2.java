/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exhandeling;

/**
 *
 * @author Win-10
 */
public class handeling2 {
    public static void main(String[] args) {
        try {
            int a=10;
            int b= 0;
            int result = a/b;
            System.out.println("Result: "+result);
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception: "+e1);
        }catch(Exception e2){
            System.out.println("Exception: "+e2);
        }
        finally {
            System.out.println("Last line of the program");
        }
    }
    
}
