package org.example.corejava.java8;

public class CarRunner {
    public static void main(String[] args) {

        Car car = new Nexon();
        car.startEngine();
        System.out.println(car.initialSpeed());
        car.blowHorn();

        Nexon nexon = new Nexon();
        nexon.isStarting();
    }
}
