package org.example.solidprinciple.liskovSubstitution.withlsp;

public class PaymentClient {

    public void processTransaction(Payment payment){
        payment.pay();
        payment.refund();
    }

    public void processTransaction(NonRefundablePayment nonRefundablePayment){
        nonRefundablePayment.pay();
    }


}
