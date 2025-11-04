package payment_gateway.impl;

import payment_gateway.Payment;
import payment_gateway.PaymentFactory;

public class BankTransferFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}
