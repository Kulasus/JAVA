/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;

/**
 *
 * @author lukas
 */
import java.util.Iterator;
public class DataWorker {
    private final int randomSurnameLength = 10;
    private final int arrayOfPointsLength = 10;
    private final int arrayOfPointsLowerLimit = 30;
    private final int arrayOfPointsUpperLimit = 100;
    private final String[] names = {"Adam","Pepa","Olina","Matej","Hana","Alena","Marena"};
    public DataWorker(){
    }
    public LinkedList<Student> vytvorStudenty(int pocetStudentu){
        LinkedList<Student> resultList = new LinkedList<Student>();
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random generator = new Random();
        String randomSurname = "";     
        for (int i = 0; i < pocetStudentu; i++) {
            ArrayList<Double> randomPoints = new ArrayList<Double>();
            for (int j = 0; j < randomSurnameLength; j++) {
                randomSurname += alphabet[generator.nextInt(alphabet.length)];
            }
            for (int k = 0; k < arrayOfPointsLength; k++) {
                randomPoints.add(generator.nextDouble() + generator.nextInt(arrayOfPointsUpperLimit - arrayOfPointsLowerLimit) + arrayOfPointsLowerLimit);
                
            }
            resultList.add(new Student(names[generator.nextInt(names.length)],randomSurname,randomPoints));
            randomSurname = "";
        }
        return resultList;
    }
    
    public LinkedList<Student> nactiStudenty(String fileName)throws IOException{
        Scanner s = null;
        LinkedList<Student> resultList = new LinkedList<>();
        String line;
        String[] lineSplitted;
        try{
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            while(s.hasNext())
            { 
                line = s.nextLine();
                lineSplitted = line.split(" ");
                ArrayList<Double> points = new ArrayList<>();
                for (int i = 2; i < lineSplitted.length; i++) {
                    points.add(Double.parseDouble(lineSplitted[i]));
                }
                resultList.add(new Student(lineSplitted[0],lineSplitted[1],points));
            }
            return resultList;
        }
        finally{
            if(s != null){s.close();}
        }
    }
    
    public LinkedList<Student> vymazStudenty(LinkedList<Student> studenti, String podretezec)
    {
        for(Student student : studenti){
            if(student.getSurname().contains(podretezec)||student.getName().contains(podretezec)){
                studenti.remove(student);
            }
        }
        return studenti;
    }
    
    public void ulozStudenty(LinkedList<Student> studenti, String fileName) throws IOException{
        BufferedWriter outputStream = null;
        StringBuilder sb = new StringBuilder();
        Iterator<Student> iteratorStudent = studenti.iterator();

        try{
            outputStream = new BufferedWriter(new FileWriter(fileName));
            while(iteratorStudent.hasNext()){
                outputStream.append(iteratorStudent.next().toString());
            }
        }
        finally{
            if(outputStream != null){outputStream.close();}
        }
    }
}
