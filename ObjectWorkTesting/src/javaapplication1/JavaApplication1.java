/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author KON0355
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anna","HASDADADova",21));
        students.add(new Student("Petr","Klíč",10));
        students.add(new Student("Obr","Maslo",33));
        students.add(new Student("Vcelka", "Amalka",15));
        students.add(new Student("Milena","caacaova", 888));
        
        //Writer writer = new Writer(new ObjectOutputStream(new FileOutputStream("output.txt")));
        //writer.WriteArrayOfStudentsToTXT(students);
        Writer writer = new Writer("outputs.txt");
        writer.WriteArrayOfStudentsToTXT(students);
        
        /*
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("output.txt"))){
            writer.writeObject(students);
            writer.close();
        }
*/
    }
    
    
}
