package org.example.solidprinciple.InterfaceSegregation.WithoutISP;

public class DevOps implements Employee{
    @Override
    public void writeCode() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void testCode() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deployCode() {
        System.out.println("Deploying the code");
    }
}
