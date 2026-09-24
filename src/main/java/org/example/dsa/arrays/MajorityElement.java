package org.example.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> frq = new HashMap<>();
        for (int n : nums) {
            frq.put(n, frq.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> mp : frq.entrySet()) {
         int key = mp.getKey();
         int value = mp.getValue();
         int compare = nums.length/2;

         if(value > nums.length/2){
             return key;
         }
        }
       return -1;
    }


}
