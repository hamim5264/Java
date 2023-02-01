/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author Win-10
 */
public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hamim");
        System.out.println(sb);
        
        sb.append(" Leon");
        sb.append(" 10");
        System.out.println(sb);
        
        //sb.reverse();
        //System.out.println(sb);
        
        //sb.delete(0, 4);
        //System.out.println(sb);
        sb.setLength(4);
        System.out.println(sb);
    }
    
}
