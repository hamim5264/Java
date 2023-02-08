/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem_solving;

/**
 *
 * @author Win-10
 */
public class Box {
    double height , width, depth;
    Box (double height, double width, double depth){
        this.height = height; //this.= instance variable declare
        this.width = width;
        this.depth = depth;
    }
    void displayVol(){
        double Vol = height*width*depth;
        System.out.println("Volume is: "+Vol);
    }
    
}
