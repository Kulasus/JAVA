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
    private static final String fileName = "studentObjects.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anna","HASDADADova",18));
        students.add(new Student("Petr","Klíč",17));
        students.add(new Student("Obr","Maslo",12));
        students.add(new Student("Vcelka", "Amalka",12));
        students.add(new Student("Milena","caacaova", 15));
        
        Writer writer = new Writer(fileName);
        writer.WriteArrayOfStudentsToTXT(students);
        
        Reader reader = new Reader(fileName);
        ExerciseClass exerciseClass = new ExerciseClass(reader.ReadArrayOfStudentsFromTXT());
        exerciseClass.printStudentWithMinimalPoints();
        System.out.println("Average points in class: "+exerciseClass.countAveragePoints());
        System.out.println("List of all names in class: "+exerciseClass.getAllNames());
    }
    
    
}
