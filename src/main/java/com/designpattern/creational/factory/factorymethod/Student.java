package com.designpattern.creational.factory.factorymethod;

public class Student extends User{
    int salary;

    Student(String name, int salary){
        super(name);
        this.salary = salary;
    }
    @Override
    public void display() {
        System.out.println("Student with name="+name+" and salary="+salary);
    }
}
