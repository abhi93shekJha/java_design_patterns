package com.designpattern.behavourial.observer;

public class MessageConsumer implements Observer {
    @Override
    public void notifyChange(Double price) {
        System.out.println("Send message as price changed to "+ price);
    }
}
