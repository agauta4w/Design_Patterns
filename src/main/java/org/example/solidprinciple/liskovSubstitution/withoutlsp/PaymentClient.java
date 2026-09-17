package org.example.solidprinciple.liskovSubstitution.withoutlsp;

public class PaymentClient {

    public void processTransaction(Payment payment){
        payment.pay();
        payment.refund();
    }
}
