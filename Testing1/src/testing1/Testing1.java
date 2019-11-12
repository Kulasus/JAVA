/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing1;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lukas
 */
public class Testing1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Loader l = new Loader();
        l.loadPersonsFromFile("input.txt");
        ArrayList<Person> persons = l.getPersons();
        for(Person p : persons){
            System.out.println(p.toString());
        }
    }
    
}
