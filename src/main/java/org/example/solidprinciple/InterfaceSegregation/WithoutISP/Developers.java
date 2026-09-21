package org.example.solidprinciple.InterfaceSegregation.WithoutISP;

public class Developers implements Employee{
    @Override
    public void writeCode() {
        System.out.println("Writing the code");
    }

    @Override
    public void testCode() {
        System.out.println("Dev testing");
    }

    @Override
    public void deployCode() {
        throw new UnsupportedOperationException();
    }
}
