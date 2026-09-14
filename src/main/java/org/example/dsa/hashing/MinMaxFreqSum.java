package org.example.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class MinMaxFreqSum{
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 6};
        System.out.println(sumHighestAndLowestFrequency(arr));

    }
    public static int sumHighestAndLowestFrequency(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i : nums){
            mp.put(i, mp.getOrDefault(i, 0) +1);
        }

        int sum =0;
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        for(int freq : mp.values()){
            maxFreq = Math.max(freq, maxFreq);
            minFreq = Math.min(freq, minFreq);
        }

//        for(Map.Entry<Integer, Integer> freq : mp.entrySet()){
//            int key = freq.getKey();
//            int value = freq.getValue();
//
//            if(value > maxFreq){
//                maxFreq = value;
//            }
//        }
//        for(Map.Entry<Integer, Integer> freq : mp.entrySet()){
//            int key = freq.getKey();
//            int value = freq.getValue();
//
//            if(value < minFreq){
//                minFreq = value;
//            }
//        }
        sum = maxFreq + minFreq;
        return sum;
    }
}
