package org.example.dsa.java8Features;

import java.util.List;

import static java.util.Collections.list;

public class FP01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,67,7);
       // printAllNumberInList(list);
        printAllNumberInListUsingFunctional(list);
    }

    private static void printAllNumberInList(List<Integer> list) {
        for(int i =0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }

    private static void printAllNumberInListUsingFunctional(List<Integer> list) {
        list.stream().forEach(System.out::println );
    }

}
