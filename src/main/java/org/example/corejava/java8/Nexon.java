package org.example.corejava.java8;

public class Nexon  implements Car{
    @Override
    public void startEngine() {
        System.out.println(this.getClass().getName());
        System.out.println("Engine starting");
    }

    public void isStarting(){
        if(Car.isRunnable()){
            System.out.println(this.getClass().getName());
            System.out.println("Engine started");
        }
    }
}
