package org.example.solidprinciple.openclose.withocp;

public class PaypalPayment implements Pay{
    @Override
    public void pay() {
        System.out.println("Paying via Paypal");
    }
}
