package com.designpattern.creational.factory.simplefactory;

public class Main {

    public static void main(String[] args){

        Button sButton = ButtonFactory.createButton(ButtonType.SQUARE, 23.1, 23.5);
    }
}
