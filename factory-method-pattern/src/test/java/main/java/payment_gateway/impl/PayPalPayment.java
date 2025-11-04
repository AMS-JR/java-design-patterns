package main.java.payment_gateway.impl;

import main.java.payment_gateway.Payment;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with PayPal the amount of $"+ amount);
    }
}
