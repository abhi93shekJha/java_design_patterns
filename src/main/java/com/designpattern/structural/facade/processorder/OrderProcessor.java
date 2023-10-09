package com.designpattern.structural.facade.processorder;

public class OrderProcessor {

    PaymentGateway paymentGateway;
    EmailService emailService;
    OrderQueue orderQueue;
    Analytics analytics;

    public void processOrder(){
        paymentGateway.processPayment();
        emailService.sendEmail();
        orderQueue.sendToOrderQueue();
        analytics.captureEvent();
    }

}
