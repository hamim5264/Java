/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Win-10
 */
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Sunday","Saturday"};
        int dayno;
    System.out.print("Enter Day No: ");
    dayno = input.nextInt();
        for (int i = 0; i <day.length; i++) {
            if (dayno==i+1){
                System.out.print(day[i]);
            }
            
        }
    
    
    
        
    }
    
}
