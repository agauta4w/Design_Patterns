package org.example.collection.iteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for(int n : nums){

            //System.out.println(n);
        }
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
            if(n == 3){
                it.remove();
            }
        }
        System.out.println(nums);

    }


}
