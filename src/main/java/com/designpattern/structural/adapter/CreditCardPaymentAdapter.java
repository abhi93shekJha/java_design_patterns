package com.designpattern.structural.adapter;

import com.designpattern.structural.adapter.thirdpartypayments.CreditCardPayment;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCardPaymentAdapter implements PaymentAdapter {
    private CreditCardPayment creditCardPayment;
    @Override
    public PaymentResult makePayment(PaymentRequest request) {
        creditCardPayment.processPayment(request.creditCardNumber);
        PaymentResult result = new PaymentResult();
        result.returnedId = "";
        return result;
    }

    @Override
    public boolean getStatus(PaymentResult result) {
        return true;
    }
}
