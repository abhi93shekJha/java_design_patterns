package com.designpattern.creational.factory.abstractfactory;

import com.designpattern.creational.factory.abstractfactory.guielements.Button;
import com.designpattern.creational.factory.abstractfactory.guielements.CheckBox;
import com.designpattern.creational.factory.abstractfactory.guielements.DarkButton;
import com.designpattern.creational.factory.abstractfactory.guielements.DarkCheckBox;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DarkThemeGUIFactory implements GUIFactory{
    private double length, breadth;
    private int noOfBoxes;
    @Override
    public Button createButton() {
        return new DarkButton(length, breadth);
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox(noOfBoxes);
    }
}
