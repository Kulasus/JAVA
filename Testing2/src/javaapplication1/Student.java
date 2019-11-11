/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author KON0355
 */
public class Student implements Serializable, Comparable<Student>{
    private final String name;
    private final String surname;
    private final int points;
    public Student(String name, String surname, int points)
    {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public int getPoints(){
        return this.points;
    }
    
    @Override
    public int compareTo(Student s)
    {
        return this.points - s.points;
    }
    
    
    @Override
    public String toString()
    {
        return super.toString() + " " + this.getName() + " " + this.getSurname() + " " + this.getPoints() + ".";
    }
}
