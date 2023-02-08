/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Win-10
 */
public class Filedemo2 { 
    public static void main(String[] args) {
        String id, name;
        try{
            
            Formatter formatter  = new Formatter("D:/Java/OOP/Person/student.text");
            Scanner input = new Scanner (System.in);
            System.out.println("How many studens: ");
            int num = input.nextInt();
            for (int i = 1; i < num; i++) {
                System.out.print("Enter Student name and id : ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n",id,name);
            }
            formatter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}
