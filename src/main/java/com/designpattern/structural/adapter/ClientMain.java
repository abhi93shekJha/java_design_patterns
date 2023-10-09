package com.designpattern.structural.adapter;

import com.designpattern.structural.adapter.thirdpartypayments.CreditCardPayment;
import com.designpattern.structural.adapter.thirdpartypayments.PaypalPayment;

import java.sql.SQLOutput;

public class ClientMain {

    public static void main(String[] args){

        PaymentAdapter creditCardPaymentAdapter = new CreditCardPaymentAdapter(new CreditCardPayment());
        PaymentAdapter paypalPaymentAdapter = new PaypalPaymentAdapter(new PaypalPayment());

        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.creditCardNumber = "1234-5678-9012-3456";
        paymentRequest.paypalId = 1497;

        PaymentResult paymentResult = creditCardPaymentAdapter.makePayment(paymentRequest);
        boolean paymentStatus = creditCardPaymentAdapter.getStatus(paymentResult);

        paymentResult = paypalPaymentAdapter.makePayment(paymentRequest);
        boolean paypalPaymentStatus = paypalPaymentAdapter.getStatus(paymentResult);

        System.out.println(""+paymentStatus + paypalPaymentStatus);
    }
}
