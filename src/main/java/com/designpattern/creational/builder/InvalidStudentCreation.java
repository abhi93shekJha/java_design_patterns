package com.designpattern.creational.builder;

public class InvalidStudentCreation extends RuntimeException{

    public InvalidStudentCreation(String message){
        super(message);
    }
}
