package org.example.corejava.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP01 {
    public static void main(String[] args) {

        List<Integer> salary = new ArrayList<>();
        salary.add(2000);
        salary.add(8000);
        salary.add(6000);
        salary.add(5000);
        salary.add(4000);
        salary.add(9000);

        long count = salary.stream().filter((Integer sal) -> sal > 3000).count();
        //System.out.println(count);

        Stream<Integer> str = Stream.iterate(1000,(Integer n) -> n+ 5000).limit(5);
        System.out.println(Arrays.toString(str.toArray()));
    }
}
