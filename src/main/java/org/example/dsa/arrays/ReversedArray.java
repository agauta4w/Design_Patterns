package org.example.dsa.arrays;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,1,1,8,9,1,2};
        //System.out.println(Arrays.toString(usingTwoPointer(arr)));
        //oddEvenCount(arr);
        firstAndLastOccurrenceOfElement(arr, 1);
    }

    static int[] usingAnotherArr(int[] nums){
        int n = nums.length;
        int[] arr  = new int[n];

        for(int i =0; i <n; i++){
            arr[i] = nums[n-i-1];
        }
        return arr;
    }

    static int[] usingTwoPointer(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start < end) {
                int swap = arr[end];
                arr[end] = arr[start];
                arr[start] = swap;
                start++;
                end--;
            }
        return arr;
    }

    static void oddEvenCount(int[] arr){
        int oddCount =0;
        int evenCount =0;

        for (int j : arr) {
            if (j % 2 != 0) {
                oddCount++;
            } else evenCount++;
        }
        System.out.println("OddCount is : " + oddCount);
        System.out.println("EvenCount is : " + evenCount);

    }

    static void firstAndLastOccurrenceOfElement(int[] arr, int n){

        for(int i =0; i < arr.length; i++){
            if(arr[i] == n){
                System.out.println(i);
                break;
            }
        }
        for (int j =arr.length -1; j >= 0; j--){
            if(arr[j] == n){
                System.out.println(j);
                break;
            }
        }
    }

}

