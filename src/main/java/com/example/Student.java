package com.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<String>();

        // TODO: Initialize the attributes
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
    public String getName(){
        return this.name;

    }
    public int getId(){
        return this.id;
    }

    public void setName(String Name){
        this.name = Name;
    }
    public void setID(int id){
        this.id = id;
    }

}
