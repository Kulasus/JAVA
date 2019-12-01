/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexam;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author lukas
 */
public class JavaExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        DataWorker dw = new DataWorker();
        LinkedList<Student> studenti = dw.nactiStudenty("students.txt");
        studenti = dw.vymazStudenty(studenti, "Ku");
        Collections.sort(studenti);
        studenti.stream().forEach(e -> System.out.println(e.toString()));
        dw.ulozStudenty(studenti, "newStudent.txt");
        
        
    }
    
}
