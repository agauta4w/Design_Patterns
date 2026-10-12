package org.example.corejava.java8.functionalInterface;

public class Eagle implements Bird{
    @Override
    public void canFly(String fly) {
        System.out.println(fly+ "Eagle is flying");
    }
}
