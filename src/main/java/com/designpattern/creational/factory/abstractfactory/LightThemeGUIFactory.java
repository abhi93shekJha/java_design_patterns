package com.designpattern.creational.factory.abstractfactory;

import com.designpattern.creational.factory.abstractfactory.GUIFactory;
import com.designpattern.creational.factory.abstractfactory.guielements.Button;
import com.designpattern.creational.factory.abstractfactory.guielements.CheckBox;
import com.designpattern.creational.factory.abstractfactory.guielements.LightButton;
import com.designpattern.creational.factory.abstractfactory.guielements.LightCheckBox;

public class LightThemeGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
