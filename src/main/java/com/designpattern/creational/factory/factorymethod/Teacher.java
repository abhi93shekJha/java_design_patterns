package com.designpattern.creational.factory.factorymethod;

public class Teacher extends User{
    int salary;
    int yearOfExperience;

    Teacher(String name, int salary, int yearOfExperience){
        super(name);
        this.salary = salary;
        this.yearOfExperience = yearOfExperience;
    }
    @Override
    public void display() {
        System.out.println("Teacher with name="+name+" and salary="+salary);
    }
}
