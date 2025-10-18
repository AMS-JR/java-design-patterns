package com.eca.payment_gateway.impl;

import com.eca.payment_gateway.Payment;

public class BankTransferPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Pay with BankTransfer the amount of: "+ amount);
    }
}
