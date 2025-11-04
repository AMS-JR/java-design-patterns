package main.java.payment_gateway.impl;

import main.java.payment_gateway.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with CreditCard the amount of $"+ amount);
    }
}
