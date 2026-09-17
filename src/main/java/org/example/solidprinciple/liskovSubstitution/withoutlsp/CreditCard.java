package org.example.solidprinciple.liskovSubstitution.withoutlsp;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid using credit card");
    }

    @Override
    public void refund() {
        System.out.println("Refund completed");
    }


}
