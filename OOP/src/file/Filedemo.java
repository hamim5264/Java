/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.File;

/**
 *
 * @author Win-10
 */
public class Filedemo {
    public static void main(String[] args) {
        File dir =  new File ("Person");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        File file1 = new File(path+"/student.text");
        File file2 = new File (path+"/teacher.text");
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File are created");
        }catch(Exception e){
            System.out.println(e);
    }
        file2.delete();
        if (file2.exists()){
            System.out.println("File is exists");
        }
        else 
        {
        System.out.println("File does not exists");
    }
    }
    
}
