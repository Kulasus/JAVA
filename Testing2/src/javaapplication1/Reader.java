/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author lukas
 */
public class Reader {
    private final String inputFileName;
    public Reader(String inputFileName){
        this.inputFileName = inputFileName;
    }
    public ArrayList<Student> ReadArrayOfStudentsFromTXT() throws IOException, ClassNotFoundException
    {
        ArrayList<Student> students = new ArrayList<>();
        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(this.inputFileName))){
            students = (ArrayList<Student>) reader.readObject();
        }
        return students;
    }
    
}
