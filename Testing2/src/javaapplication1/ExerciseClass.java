/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
/**
 *
 * @author lukas
 */
public class ExerciseClass {
    private final ArrayList<Student> students;
    public ExerciseClass(ArrayList<Student> students){
        this.students = students;
    }
    public void printStudentWithMinimalPoints()
    {
        int minimum = students.get(0).getPoints(); //Gets the minimal points
        for(Student s : students)
        {
            if(s.getPoints() < minimum){
                minimum = s.getPoints();
            }
        }
        System.out.println("Worst students are: ");
        for(Student s : students) //Prints the students which have equal points to minimum
        {
            if(s.getPoints() == minimum){
                System.out.println(s.toString());
            }
        }
    }
    
    public double countAveragePoints()
    {
        double countStudents = students.size();
        double allPoints = 0;
        for(Iterator<Student> s = students.iterator(); s.hasNext();)
        {
            allPoints += s.next().getPoints();
        }
        return allPoints/countStudents;
    }
    
    public String getAllNames()
    {
        String result = students.stream()
               .map(Student::getName)
               .collect(Collectors.joining(", "));
        return result;    
    }
    
    public ArrayList<Student> getStudents(){
        return this.students;
    }
}
