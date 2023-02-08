/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Win-10
 */
public class FileDemo3 { 
    public static void main (String[] args){
        try{
            File file = new File ("D:/Java/OOP/Person/student.text");
            Scanner scanner = new Scanner (file);
            while(scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("Id: "+id+" Name: "+name);
            }
            scanner.close();
        }catch (Exception e){
        System.out.println(e);
    }
    }
    
}
