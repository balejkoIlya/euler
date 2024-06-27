package com.example.iotest;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String surname;
    int salary;
    Car car;

    public Employee(String name, String surname, int salary,Car car) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.car=car;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
