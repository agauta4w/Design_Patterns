package org.example.corejava.java8.functionalInterface.consumer;

import java.util.function.Supplier;

public class SupplierRunner {
    public static void main(String[] args) {

        Supplier<String> greet = () -> "Hello Ayush! Good day";
        System.out.println(greet.get());
    }
}
