package com.example.streamtest;

public class Employee {
    String name;
    String deportament;

    public Employee(String name, String deportament) {
        this.name = name;
        this.deportament = deportament;
    }
    public String getName(){
        return name;
    }
    public String getDeportament(){
        return deportament;
    }
    public String toString(){
        return getName();
    }

}
