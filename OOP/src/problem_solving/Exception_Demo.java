/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem_solving;

/**
 *
 * @author Win-10
 */
import java.util.Scanner;
public class Exception_Demo {
    public static void main(String[] args) {
        
        int count  = 1;
                do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.print("Enter num1: ");
                int num1= input.nextInt();
                System.out.print("Enter num2: ");
                int num2 = input.nextInt();
                int result = num1/num2;
                System.out.println("Result: "+num1+"/"+num2+"="+result);
                count =2;
            }catch(Exception e){
                System.out.println("Exception: "+e);
                System.out.println("you must enter integer. please try again");
            }
        }while (count ==1);
    }
    
}
