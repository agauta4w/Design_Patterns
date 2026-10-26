package org.example.dsa.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] empty = {};
        int[] nums = {0,1,2,0,13,0,5};
        System.out.println(Arrays.toString(moveZero(empty)));
        System.out.println(Arrays.toString(moveZero(nums)));
        moveZeroOptimal(nums);

    }

    static int[] moveZero(int[] nums){

        if(nums.length <1){
            return new int[]{};
        }
        int[] res = new int[nums.length];
        int k = 0;

        for (int num : nums) {
            if (num != 0) {
                res[k++] = num;
            }
        }
        return res;
    }

    static void moveZeroOptimal(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}
