/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lukas
 */
public class Writer {
    private final ArrayList<Person> persons;
    private BufferedWriter outputStream;
    public Writer(ArrayList<Person> persons){
        this.persons = persons;
    }
    public void printToFile(String fileName) throws IOException{
        try{
            outputStream = new BufferedWriter(new FileWriter(fileName));
            String parts[];
            Time bestTime;
            for(Person p : persons){
                parts = p.getFullName().split(" ");
                outputStream.write(parts[0]);
                outputStream.write(", ");
                outputStream.write(parts[1]);
                outputStream.write(", ");
                bestTime = p.getBestTime();
                outputStream.write(Integer.toString(bestTime.getHours()));
                outputStream.write(":");
                outputStream.write(Integer.toString(bestTime.getMinutes()));
                outputStream.write(",");
                outputStream.write(Integer.toString(bestTime.getSeconds()));
                outputStream.newLine(); 
            }
        } finally{
            outputStream.close();
        }
    }
}
