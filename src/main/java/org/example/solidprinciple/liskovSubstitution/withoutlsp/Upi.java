package org.example.solidprinciple.liskovSubstitution.withoutlsp;

public class Upi implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid using Upi");
    }

    @Override
    public void refund() {
        System.out.println("refund Successful");
    }

    public void checkBalance(){
        System.out.println("Checking Upi balance");
    }
}
