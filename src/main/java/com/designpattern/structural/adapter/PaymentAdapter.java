package com.designpattern.structural.adapter;

public interface PaymentAdapter {

    PaymentResult makePayment(PaymentRequest request);

    boolean getStatus(PaymentResult result);
}
