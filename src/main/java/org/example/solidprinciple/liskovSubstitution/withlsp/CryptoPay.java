package org.example.solidprinciple.liskovSubstitution.withlsp;

public class CryptoPay implements NonRefundablePayment {
    @Override
    public void pay() {
        System.out.println("Crypto payment done");
    }


}
