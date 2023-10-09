package com.designpattern.structural.adapter;

import com.designpattern.structural.adapter.thirdpartypayments.CreditCardPayment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentAdapterTest {
    PaymentAdapter paymentAdapter = null;
    PaymentRequest paymentRequest = null;
    @BeforeEach
    public void setup(){
        paymentRequest = new PaymentRequest();
        paymentRequest.paypalId = 1234;
        paymentRequest.creditCardNumber = "mycc";
        paymentAdapter = new CreditCardPaymentAdapter(new CreditCardPayment());
    }

    @Test
    public void testWorkingOfCreditCardPaymentAdapter(){
        PaymentResult result = paymentAdapter.makePayment(paymentRequest);
        boolean paymentStatus = paymentAdapter.getStatus(result);
        assert(paymentStatus);
    }
}
