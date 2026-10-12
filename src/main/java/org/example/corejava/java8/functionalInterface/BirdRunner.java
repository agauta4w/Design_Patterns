package org.example.corejava.java8.functionalInterface;

public class BirdRunner {
    public static void main(String[] args) {

        Bird b1 = new Bird() {
            @Override
            public void canFly(String fly) {
                System.out.println(fly+ "Hello birds");
            }
        };

        b1.canFly("Using Anonymous Class: ");

        Bird b2 = new Eagle();
        b2.canFly("Using functional Interface traditional style: ");

        Bird b3 = (String fly) -> {
            System.out.println(fly+ "flying using lambda");
        };
        b3.canFly("Using lambda function: ");
    }
}
