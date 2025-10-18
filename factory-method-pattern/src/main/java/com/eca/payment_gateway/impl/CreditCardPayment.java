package com.eca.payment_gateway.impl;

import com.eca.payment_gateway.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with CreditCard the amount of: "+ amount);
    }
}
