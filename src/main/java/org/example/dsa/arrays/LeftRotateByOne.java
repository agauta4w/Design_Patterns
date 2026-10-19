package org.example.dsa.arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        leftRotate(arr);
    }

    public static void leftRotate(int[] nums){
        int temp = nums[0];
        for(int i =1; i <nums.length; i++){
            nums[i-1] =nums[i] ;
        }
        nums[nums.length-1]=temp;

        System.out.println(Arrays.toString(nums));
    }
}

