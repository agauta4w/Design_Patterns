package org.example.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringElement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 6, 9, 6,11,11,11,3,3,3};
        Map<Integer, Integer> mao = new HashMap<>();
        for (int n : arr) {
            mao.put(n, mao.getOrDefault(n, 0) + 1);
        }
        int maxFreqVal = 0;
        int highOccuringKey = 0;

        for(Map.Entry<Integer, Integer> entry : mao.entrySet()){

            int key = entry.getKey();
            int val = entry.getValue();
            if( val > maxFreqVal || (val > highOccuringKey && key < highOccuringKey)){
                maxFreqVal = val;
                highOccuringKey = key;
            }
        }
        System.out.println(highOccuringKey);
    }

//    public int mostFrequentElement(int[] nums){
//        int[] store = new int[10];
//        for(int i : nums) {
//            store[i]++;
//        }
//    }
}


