package com.designpattern.creational.factory.factorymethod;

public abstract class User {
    String name;

    User(String name){
        this.name = name;
    }
    public abstract void display();
}
