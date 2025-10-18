package com.eca.payment_gateway.impl;

import com.eca.payment_gateway.Payment;
import com.eca.payment_gateway.PaymentFactory;

public class CreditCardFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
