package com.designpattern.creational.factory.simplefactory;

public class SquareButton implements Button {
    double length, breadth;
    public SquareButton(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
