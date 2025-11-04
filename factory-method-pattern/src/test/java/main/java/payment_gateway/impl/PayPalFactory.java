package main.java.payment_gateway.impl;

import main.java.payment_gateway.Payment;
import main.java.payment_gateway.PaymentFactory;

public class PayPalFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
