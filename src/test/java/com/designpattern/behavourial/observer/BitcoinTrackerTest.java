package com.designpattern.behavourial.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;


public class BitcoinTrackerTest {

    BitcoinTracker bitcoinTracker;

    @BeforeEach
    void setup(){
        bitcoinTracker = new BitcoinTracker(100.0);
        Observer emailService = new EmailConsumer();
        bitcoinTracker.register(emailService);
        bitcoinTracker.register(new MessageConsumer());
    }

    @Test
    void testPriceChange(){
        bitcoinTracker.setPrice(110.0);
        assertEquals(110.0, bitcoinTracker.getPrice());
    }
}
