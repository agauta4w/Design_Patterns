package org.example.solidprinciple.liskovSubstitution.withoutlsp;

public class CryptoPay implements Payment{
    @Override
    public void pay() {
        System.out.println("Crypto payment done");
    }

    @Override
    public void refund() {
        throw new UnsupportedOperationException("Refund not supported with crypto payment");
    }
}
