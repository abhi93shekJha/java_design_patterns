package com.designpattern.creational.factory.abstractfactory.guielements;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DarkButton implements Button{
    private double length, breadth;

    public void render(){
        System.out.println("Rendering button with length=" + length + " breadth="+breadth);
    }
}
