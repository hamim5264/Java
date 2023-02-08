/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.LinkedList;

/**
 *
 * @author Win-10
 */
public class StudentList {
    public static void main(String[] args) {
        //student linked list
        LinkedList<List> list = new LinkedList<List>();
        
        //student create
        List l1 = new List (101, "Hamim", "Eleven");
        List l2 = new List (102, "Leon", "Eleven");
        List l3 = new List (103, "Lima", "Eleven");
        List l4 = new List (104, "Leja", "Eleven");
        
        //adding student to the linkedlist
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        
        //printing 
        for (List l : list){
            System.out.println(l.id+" "+l.name+" " +l.classname);
        }
    }
    
}
