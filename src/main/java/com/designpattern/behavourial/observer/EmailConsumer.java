package com.designpattern.behavourial.observer;

public class EmailConsumer implements Observer {

    @Override
    public void notifyChange(Double price) {
        System.out.println("Send email, as price changed to " + price);
    }
}
