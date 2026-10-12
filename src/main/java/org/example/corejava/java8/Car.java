package org.example.corejava.java8;

public interface Car {

    void startEngine();

    default void blowHorn(){
        System.out.println("Beep , Beep !!");
    }

    default int initialSpeed(){
        return 5;
    }

    static  boolean isRunnable(){
        return true;
    }

}
