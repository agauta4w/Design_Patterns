package org.example.collection.enumerating;

public class EnumRunner {
    public static void main(String[] args) {
//        WeekDay weekDay = WeekDay.valueOf("Friday");
//        System.out.println(weekDay.name());
//        System.out.println(weekDay.ordinal());
//
//        for(WeekDay weekDay1 : WeekDay.values()){
//            System.out.println(weekDay1.ordinal());
//        }


        State state = State.ANDHRAPRADESH;
//        System.out.println(state);

//        for (State state1 : State.values()){
//            System.out.println(state1.getComment());
//            System.out.println(state1.getValue());
//        }

        State state2 = State.getValue(100);
        System.out.println(state2);
    }
}
