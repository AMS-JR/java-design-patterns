package payment_gateway.impl;

import payment_gateway.Payment;
import payment_gateway.PaymentFactory;

public class CreditCardFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
