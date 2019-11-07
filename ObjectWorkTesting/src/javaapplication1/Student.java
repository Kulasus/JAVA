/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;

/**
 *
 * @author KON0355
 */
public class Student implements Serializable{
    private final String name;
    private final String surname;
    private final int points;
    public Student(String name, String surname, int points)
    {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }
}
