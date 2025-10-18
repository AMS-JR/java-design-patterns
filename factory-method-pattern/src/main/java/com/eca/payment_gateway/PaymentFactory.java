package com.eca.payment_gateway;

public interface PaymentFactory {
    Payment createPayment();

    default void process(double amount){
        Payment payment = this.createPayment();
        payment.pay(amount);
    }
}
