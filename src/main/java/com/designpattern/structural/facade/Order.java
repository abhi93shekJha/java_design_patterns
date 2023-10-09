package com.designpattern.structural.facade;

import com.designpattern.structural.facade.processorder.OrderProcessor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {

    OrderProcessor orderProcessor;

    public void order(){
        orderProcessor.processOrder();
    }

}
