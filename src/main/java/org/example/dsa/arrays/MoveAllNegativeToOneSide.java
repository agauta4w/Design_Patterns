package org.example.dsa.arrays;

import java.util.Arrays;

public class MoveAllNegativeToOneSide {
    public static void main(String[] args) {
        int[] nums = {1,-1,2,0,-2,-5,0,4};
        System.out.println(Arrays.toString(moveNegative(nums)));

    }


    static int[] moveNegative(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                // Left is non-negative and right is negative
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return arr;
    }


}
