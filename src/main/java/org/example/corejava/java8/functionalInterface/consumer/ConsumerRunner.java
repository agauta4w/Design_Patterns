package org.example.corejava.java8.functionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerRunner {
    public static void main(String[] args) {

        Consumer<String> customer =name -> System.out.println("Hello " + name);
        customer.accept("Ayush");

        Consumer<String> nameInUpper = say -> System.out.println(say.toUpperCase());
        Consumer<String> nameInLower = say -> System.out.println(say.toLowerCase());

        Consumer<String> combined = nameInLower.andThen(nameInUpper);
        combined.accept("Ayush Gautam");
    }
}

