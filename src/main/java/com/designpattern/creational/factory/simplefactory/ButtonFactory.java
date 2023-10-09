package com.designpattern.creational.factory.simplefactory;

import java.awt.*;

public class ButtonFactory {

    public static Button createButton(ButtonType type, Object... args){
        if(type == ButtonType.CIRCLE){
            return null;
        }else if(type == ButtonType.SQUARE){
            if (args.length==2 && args[0] instanceof Double && args[1] instanceof Double)
                return new SquareButton((Double)args[0], (Double)args[1]);
            else
                throw new IllegalArgumentException("Wrong inputs for square button");
        }else if(type == ButtonType.TRIANGLE) {
            return new TraingularButton((String) args[0]);
        }else {
            throw new IllegalArgumentException("Button type does not exists!!");
        }
    }
}
