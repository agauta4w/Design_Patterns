package org.example.dsa.arrays;

import java.util.Arrays;

public class ConsecutiveArray {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        int[] num2 = {1,3};
        System.out.println(isConsecutive(num2));

    }

    public  static boolean isConsecutive(int[] nums) {
        // Your code goes here
        Arrays.sort(nums);
        int len = nums.length;
        int x = nums[0];
        int range = (x + len -1);
        for (int num : nums) {
            if (num > range) {
                return false;
            }
        }
        return true;
    }
}
