package com.designpattern.creational.factory.abstractfactory;

import com.designpattern.creational.factory.abstractfactory.guielements.Button;
import com.designpattern.creational.factory.abstractfactory.guielements.CheckBox;

public interface GUIFactory {

    Button createButton();
    CheckBox createCheckBox();
}
