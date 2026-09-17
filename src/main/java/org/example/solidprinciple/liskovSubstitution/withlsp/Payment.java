package org.example.solidprinciple.liskovSubstitution.withlsp;

public interface Payment extends NonRefundablePayment {

    public void refund();

}
