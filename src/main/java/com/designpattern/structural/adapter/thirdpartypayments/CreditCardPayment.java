package com.designpattern.structural.adapter.thirdpartypayments;

public class CreditCardPayment {

    public void processPayment(String creditCardNo){
        System.out.println("Paying for card: " + creditCardNo);
    }


}
