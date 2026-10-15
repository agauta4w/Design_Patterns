package org.example.dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,4};
        //final res = {1,2,3,4}
        System.out.println((duplicateRemoval(arr)));
    }

    static int duplicateRemoval(int[] nums) {
//        int n = nums.length;
//        int[] arr = new int[n];
//        boolean isUnique= false;
//        for(int i = 1; i < n ; i++){
//            if(arr[i] != arr[i-1]){
//                isUnique = true;
//
//
//            }
//        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }

        }
        return i + 1;

//        Set<Integer> set = new TreeSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//
//
//        int[] res = new int[set.size()];
//        int index =0;
//
//        for(int i : set){
//            res[index++] = i;
//        }
//        return res;
//    }
    }
}
