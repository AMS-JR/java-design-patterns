package main.java.payment_gateway;

import main.java.payment_gateway.impl.BankTransferFactory;
import main.java.payment_gateway.impl.CreditCardFactory;
import main.java.payment_gateway.impl.PayPalFactory;

public class PaymentGatewayApplication {
    public static void main(String[] args) {
        PaymentFactory creditCard = new CreditCardFactory();
        creditCard.process(30);
        PaymentFactory paypal = new PayPalFactory();
        paypal.process(60);
        PaymentFactory banktransfer = new BankTransferFactory();
        banktransfer.process(90);
    }
}
