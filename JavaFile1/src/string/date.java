/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    Date date = new Date();
    DateFormat  dateformat  = new SimpleDateFormat("dd/MM/YYYY");
    String currentdate = dateformat.format (date);
    System.out.println("Current Date="+currentdate);
    
    
}
