package org.example.dsa.arrays;

import java.util.Arrays;

public class MaxInEachRow {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4}, {5, 6, 2, 6}};
        MaxInEachRow mn = new MaxInEachRow();
        int[] ints = mn.maxInEachRow(nums);
        System.out.println(Arrays.toString(ints));

    }

    public int[] maxInEachRow(int[][] arr){
        if(arr.length <1){
            return new int[]{};
        }
        int[] result = new int[arr.length];

        for(int i =0; i < arr.length ;i++){
            int max = Integer.MIN_VALUE;
            for(int j =0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            result[i] = max;
        }
        return result;
    }
}
