package org.example.dsa.arrays;

//Input: nums = [1, 1, 0, 0, 1, 1, 1, 0]
//
//Output: 3

//Input: nums = [0, 0, 0, 0, 0, 0, 0, 0]
//
//Output: 0

public class ConsecutiveOne {
    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        ConsecutiveOne c1 = new ConsecutiveOne();

        System.out.println(c1.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max =0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

}
