package com.designpattern.creational.builder;

public class Client {

    public static void main(String[] args){
        Student student = Student.builder()
                .withFirstName("Abhishek")
                .withLastName("Jha")
                .rollNumber(2)
                .build();
        System.out.println(student.getMarks());
    }
}
