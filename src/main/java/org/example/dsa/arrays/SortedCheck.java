package org.example.dsa.arrays;

public class SortedCheck {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {3,4,5,2,6};
        int[] arr3 = {-1,-1,-1};

        int[] c = {1, 2, 2, 3};
        System.out.println(isSorted(c));

    }

    static boolean isSorted(int[] arr){

        if(arr.length <=1){
            return true;
        }

        for(int i =1; i < arr.length; i++){
            if (arr[i - 1] > arr[i]) {
               return false;
            }
        }
        return true;
    }

}
