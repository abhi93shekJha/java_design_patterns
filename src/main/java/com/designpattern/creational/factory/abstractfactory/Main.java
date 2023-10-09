package com.designpattern.creational.factory.abstractfactory;

import com.designpattern.creational.factory.abstractfactory.guielements.*;

public class Main {

    public static void main(String[] args){

        GUIFactory darkThemeGUIFactory = new DarkThemeGUIFactory(23.0, 12.9, 4);
        Button darkButton = darkThemeGUIFactory.createButton();
        CheckBox darkCheckBox = darkThemeGUIFactory.createCheckBox();

        darkButton.render();
        darkCheckBox.renderCheckbox();

        GUIFactory lightThemeGUIFactory = new LightThemeGUIFactory();
        Button lightButton = lightThemeGUIFactory.createButton();
    }
}
