/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing1;

import java.util.LinkedList;

/**
 *
 * @author lukas
 */
public class Person {
    private final String name,surname;
    private final LinkedList<Time> times;
    public Person(String name, String surname, LinkedList<Time> times){
        this.name = name;
        this.surname = surname;
        this.times = times;
    }
    public String getFullName(){
        return name + " " + surname;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + getFullName();
    }
    
    public Time getBestTime(){
        Time best = times.getFirst();
        for(Time t:times)
        {
            if(t.getHours() < best.getHours())
            {
                best = t;
            }
            else if(t.getHours() == best.getHours())
            {
                if(t.getMinutes() < best.getMinutes())
                {
                    best = t;
                }
                else if(t.getMinutes() == best.getMinutes())
                {
                    if(t.getSeconds() < best.getSeconds())
                    {
                        best = t;
                    }
                }
            }
        }
        return best;
    }
}
