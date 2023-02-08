/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package static_variable;

/**
 *
 * @author Win-10
 */
public class Student {
    static int count = 0;
    Student () {
        count ++;
}
    void printstudent (){
        System.out.println("Total student: "+count);
    }
    
}
