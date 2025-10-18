package com.eca.payment_gateway;

import com.eca.payment_gateway.impl.BankTransferFactory;
import com.eca.payment_gateway.impl.CreditCardFactory;
import com.eca.payment_gateway.impl.PayPalFactory;

public class Demo {
    public static void main(String[] args) {
        PaymentFactory creditCard = new CreditCardFactory();
        creditCard.process(30);
        PaymentFactory paypal = new PayPalFactory();
        paypal.process(60);
        PaymentFactory banktransfer = new BankTransferFactory();
        banktransfer.process(90);
    }
}
