/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author lukas
 */
public class Loader {
    private ArrayList<Person> persons = new ArrayList<>();
    private BufferedReader inputStream;
    private StringBuilder sb;
    public Loader(){
    }
    public void loadPersonsFromFile(String fileName) throws IOException{
        try{
            inputStream = new BufferedReader(new FileReader(fileName));
            String line = inputStream.readLine();
            sb = new StringBuilder();
            String parts[]; //One line from file splitted into parts by space
            String name; //parts[0]
            String surname; //parts[1]
            String hours,minutes,seconds;
            Time time; //For storing one time in for loop
            LinkedList<Time> times = new LinkedList<>();
            while(line != null){
                parts = line.split(" ");
                name = parts[0];
                surname = parts[1];
                for (int i = 2; i < parts.length; i++) {
                   hours = parts[i].substring(0,2);
                   minutes = parts[i].substring(3,5);
                   seconds = parts[i].substring(6,8);
                   time = new Time((int)hours.charAt(0)*10+(int)hours.charAt(1),(int)minutes.charAt(0)*10+(int)minutes.charAt(1),(int)seconds.charAt(0)*10+(int)seconds.charAt(1));
                   times.add(time);
                }
                Person p = new Person(name,surname,times);
                persons.add(p);
                line = inputStream.readLine();
            }
        }
        finally{
            inputStream.close();
        }
        //return sb.toString();
            
    }
    
    public ArrayList<Person> getPersons()
    {
        return this.persons;
    }
}
