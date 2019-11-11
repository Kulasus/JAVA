/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author KON0355
 */
public class Writer {
    private final String outputFileName;
    public Writer(String outputFileName){
        this.outputFileName = outputFileName;
    }
    public void WriteArrayOfStudentsToTXT(ArrayList<Student> students) throws IOException
    {
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(this.outputFileName))){
            writer.writeObject(students);
            writer.close();
        }
    }
}
