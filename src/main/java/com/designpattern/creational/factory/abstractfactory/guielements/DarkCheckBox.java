package com.designpattern.creational.factory.abstractfactory.guielements;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DarkCheckBox implements CheckBox{
    private int noOfBoxes;

    public void renderCheckbox(){
        System.out.println("Rendering checkbox having no.="+noOfBoxes);
    }
}
