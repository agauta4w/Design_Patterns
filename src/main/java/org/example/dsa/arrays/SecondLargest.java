package org.example.dsa.arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] nums = {10,20,30};
        int[] nums2 = {10,10,10};

        System.out.println(secondLargestElement(nums2));

    }
    public static int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for(int i =0; i < nums.length; i++){
            if(nums[i] > largest){
                secondLargestElement = largest;
                largest = nums[i];
            }
            if(nums[i] > secondLargestElement && nums[i] != largest){
                secondLargestElement = nums[i];
            }
        }
        if (secondLargestElement == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargestElement;
    }
}
