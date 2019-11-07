/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author KON0355
 */
public class Writer {
    private final ObjectOutputStream writer;
    public Writer(ObjectOutputStream writer){
        this.writer = writer;
    }
    public void WriteArrayOfStudentsToTXT(ArrayList<Student> students)
    {
        try
        {
           writer.writeObject(students);
           writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Cant opet txt file!");
        }
    }
}
