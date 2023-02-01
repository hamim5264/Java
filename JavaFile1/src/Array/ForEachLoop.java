/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Win-10
 */
public class ForEachLoop {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int sum = 0;
        for(int x:num){
            sum = sum+x;
        }
        System.out.print(sum);
    }
    
}
