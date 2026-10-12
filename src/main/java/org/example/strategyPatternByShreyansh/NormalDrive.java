package org.example.strategyPatternByShreyansh;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive Capability : Normal");
    }
}
