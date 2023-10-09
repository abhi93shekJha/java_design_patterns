package com.designpattern.creational.factory.factorymethod;

public class TeacherFactory implements UserFactory{

    String name;
    int salary, yearOfExperience;

    TeacherFactory(String name, int salary, int yearOfExperience){
        this.name = name;
        this.salary = salary;
        this.yearOfExperience = yearOfExperience;
    }
    @Override
    public User createUser() {
        return new Teacher(this.name, this.salary, this.yearOfExperience);
    }
}
