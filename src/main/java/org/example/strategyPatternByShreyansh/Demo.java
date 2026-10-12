package org.example.strategyPatternByShreyansh;

public class Demo {

    public static void main(String[] args) {
        System.out.println("#### Strategy Design Pattern  ####");

        Vehicle v1 = new GoodsVehicle(new NormalDrive());
        v1.drive();
        Vehicle v2 = new SportsVehicle(new SportsDrive());
        v2.drive();
    }
}
