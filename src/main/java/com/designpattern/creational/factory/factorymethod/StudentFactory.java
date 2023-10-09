package com.designpattern.creational.factory.factorymethod;

public class StudentFactory implements UserFactory{
    String name;
    int salary;

    StudentFactory(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    @Override
    public User createUser() {
        return new Student(this.name, this.salary);
    }
}
