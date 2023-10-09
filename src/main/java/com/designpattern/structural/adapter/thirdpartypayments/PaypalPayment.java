package com.designpattern.structural.adapter.thirdpartypayments;

public class PaypalPayment {

    public String makePayment(int paypalId){
        System.out.println("Making Payment!!");
        return "1234";
    }

    public boolean getPaymentStatus(String paymentId){
        return true;
    }

}
