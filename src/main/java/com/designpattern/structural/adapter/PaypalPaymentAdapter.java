package com.designpattern.structural.adapter;

import com.designpattern.structural.adapter.thirdpartypayments.PaypalPayment;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaypalPaymentAdapter implements PaymentAdapter {
    private PaypalPayment paypalPayment;
    @Override
    public PaymentResult makePayment(PaymentRequest request) {
        String paymentId = paypalPayment.makePayment(request.paypalId);
        PaymentResult result = new PaymentResult();
        result.returnedId = paymentId;
        return result;
    }

    @Override
    public boolean getStatus(PaymentResult result) {
        return paypalPayment.getPaymentStatus(result.returnedId);
    }
}
