package com.example.uino.listview_customadapter;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by UINO on 3/21/2017.
 */

public class Person implements Serializable {

    protected  String firstName;
    protected  String lastName;
    protected  Integer ID;

    //simple constructor
    public Person(){}

    //constructor with first name
    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
        Random rnd = new Random();
        ID= rnd.nextInt(100);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    //
    @Override
    public String toString(){
        String person="";
        person+="First name:";
        person+=getFirstName();
        person+="\nLast Name:";
        person+=getLastName();
        person+="\nID:";
        person+=getID();
        return person;
    }
}

