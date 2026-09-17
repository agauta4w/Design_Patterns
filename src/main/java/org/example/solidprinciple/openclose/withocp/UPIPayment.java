package org.example.solidprinciple.openclose.withocp;

public class UPIPayment implements Pay {
    @Override
    public void pay() {
        System.out.println("Paying through UPI");
    }
}
