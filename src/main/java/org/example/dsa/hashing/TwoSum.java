package org.example.dsa.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,1, 4,5, 6, 7, 9,8};
        int t = 12;
        System.out.println(Arrays.toString(optimal(nums, t)));
    }

    public static int[] brute(int[] nums, int target){
        for (int num : nums) {
            for (int j = 1; j < nums.length; j++) {
                if (num + nums[j] == target) {
                    return new int[]{num, nums[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] optimal(int[] nums, int tar){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            int nextNum = tar - nums[i];
            if(mp.containsKey(nextNum)){
                return new int[]{mp.get(nextNum), i}; // ✅ found
            }
            mp.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
