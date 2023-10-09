package com.designpattern.behavourial.observer;

public class Main {

    public static void main(String[] args){

        BitcoinTracker tracker = new BitcoinTracker(100.0);

        Observer emailConsumer = new EmailConsumer();
        Observer smsConsumer = new MessageConsumer();

        // Consumers subscribing to publishers
        tracker.register(emailConsumer);
        tracker.register(smsConsumer);

        tracker.setPrice(110.0);
    }
}
