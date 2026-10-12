package org.example.strategyPatternByShreyansh;

public class SportsDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive Capability : Sports");
    }
}
