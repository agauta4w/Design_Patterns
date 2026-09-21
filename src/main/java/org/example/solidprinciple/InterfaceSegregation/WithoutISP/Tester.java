package org.example.solidprinciple.InterfaceSegregation.WithoutISP;

public class Tester implements Employee{
    @Override
    public void writeCode() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void testCode() {
        System.out.println("test the code");
    }

    @Override
    public void deployCode() {
        throw new UnsupportedOperationException();
    }
}
