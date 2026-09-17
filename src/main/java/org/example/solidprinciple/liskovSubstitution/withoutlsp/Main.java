package org.example.solidprinciple.liskovSubstitution.withoutlsp;

import java.util.List;

//The Liskov Substitution Principle (LSP) states that objects of a superclass should be
// replaceable with objects of a
// subclass without breaking the application or altering expected behavior
public class Main {
    public static void main(String[] args) {
        PaymentClient client = new PaymentClient();

        List<Payment> paymentList = List.of(new CreditCard(), new Upi(), new CryptoPay());
        for(Payment payment : paymentList) {
            client.processTransaction(payment);
        }

//        Payment p = new Upi();
//        Payment c = new CreditCard();
//        List<String> S = new ArrayList<>();
    }
}
