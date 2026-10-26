package org.example.dsa.arrays;

import java.util.Arrays;

public class PrintAll2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
        printElements(arr);
        System.out.println(sumOfElements(arr));
        System.out.println(findLargest(arr));
        System.out.println(Arrays.toString(countEvenOdd(arr)));
        System.out.println(Arrays.toString(rowSum(arr)));

    }// 1. Print all elements
    static void printElements(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
        }
    }

    static int sumOfElements(int[][] arr) {

        System.out.println();
        int sum =0;
        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static int findLargest(int[][] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }

    static int[] countEvenOdd(int[][] arr) {
        if(arr.length <1){
            return new int[]{};
        }
        int odd = 0, even =0;
        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] % 2 !=0){
                    odd++;
                } else even++;
            }
        }
        return new int[]{odd,even};
    }


    static int[] rowSum(int[][] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {

                // TODO: calculate current row
                sum += arr[i][j];

            }

            result[i] = sum;
        }

        return result;
    }

    //find max element in each row :
//    static int[] rowMaximum(int[][] arr) {
//
//    }
}

