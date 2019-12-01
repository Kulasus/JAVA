/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;

/**
 *
 * @author lukas
 */
public class Student implements IPrumer, Comparable<Student>{
    private static int id = 1;
    private String jmeno;
    private String prijmeni;
    private ArrayList<Double> body;
    
    public Student(){this("Karel","Svoboda",new ArrayList<Double>());}
    public Student(String jmeno, String prijmeni, ArrayList<Double> body){
        System.out.println("Vytvořen objekt číslo " + id);
        id++;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.body = body;
    }

    @Override
    public double vypoctiPrumer() throws NoSuchElementException {
        
        try{
        OptionalDouble average = this.body.stream().filter(i -> i > 50.0).mapToDouble(i -> i).average();
        return average.getAsDouble();
        }
        catch(Exception e){
            throw new NoSuchElementException("Student nema zadne body splnujici podminku pro vypocet prumeru.");
        }
    }
    
    @Override
    public String toString(){
        StringBuilder stringBuilderStudentToString = new StringBuilder();
        Iterator<Double> iteratorPointsToString = this.body.iterator();
        //-------------------------APPENDING-----------------------------------
        stringBuilderStudentToString.append(this.jmeno);
        stringBuilderStudentToString.append(" ");
        stringBuilderStudentToString.append(this.prijmeni);
        stringBuilderStudentToString.append(" | BODY: ");
        while(iteratorPointsToString.hasNext()){
            if(iteratorPointsToString.next() > 100.0 || iteratorPointsToString.next() < 0.0){throw new IllegalStateException("neplatny pocet bodu u studenta...");}
            stringBuilderStudentToString.append(iteratorPointsToString.next());
            stringBuilderStudentToString.append(" ");
        }
        stringBuilderStudentToString.append("| PRUMER: ");
        stringBuilderStudentToString.append(this.vypoctiPrumer());
        //---------------------------------------------------------------------
        return stringBuilderStudentToString.toString();
    }

    @Override
    public int compareTo(Student i) {
        return this.getSurname().compareTo(i.getSurname());
    }
    
    public String getSurname(){
        return this.prijmeni;
    }
    public String getName(){
        return this.jmeno;
    }
}
