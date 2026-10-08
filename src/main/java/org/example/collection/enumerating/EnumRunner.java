package org.example.collection.enumerating;

public class EnumRunner {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.valueOf("Friday");
        System.out.println(weekDay.name());
        System.out.println(weekDay.ordinal());

        for(WeekDay weekDay1 : WeekDay.values()){
            System.out.println(weekDay1.ordinal());
        }
    }
}
