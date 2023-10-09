package com.designpattern.creational.factory.factorymethod;

public class Main {

    public static void main(String[] args){

        UserFactory studentFactory = new StudentFactory("Abhishek", 100000);
        UserFactory teacherFactory = new TeacherFactory("Jha", 1000, 3);
        User student = studentFactory.createUser();
        User teacher = teacherFactory.createUser();

        student.display();
        teacher.display();
    }
}
