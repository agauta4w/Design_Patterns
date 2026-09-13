package org.example.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequent {
    public static void main(String[] args) {

        int[] num = {10, 9 ,7, 7};
        System.out.println(secondMostFrequentElement(num));
    }

    public static int secondMostFrequentElement(int[] nums) {

        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i : nums){
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }

        int maxFreq =0, secondMaxFreq = 0;
        int maxEleKey = -1, secondMaxkey =-1;

        for(Map.Entry<Integer, Integer> rr : mpp.entrySet()){
            int freq = rr.getValue();
            int key = rr.getKey();

            if(freq > maxFreq){
                secondMaxFreq = maxFreq;
                maxFreq = freq;
                secondMaxkey = maxEleKey;
                maxEleKey = key;
            } else if (freq == maxFreq) {
                maxEleKey = Math.min(maxEleKey, key);
            }
            else if (freq > secondMaxFreq){
                secondMaxFreq = freq;
                secondMaxkey = key;
            }
            else if( freq == secondMaxFreq){
                secondMaxkey = Math.min(secondMaxkey, key);
            }
        }
        return  secondMaxkey;
    }
}
