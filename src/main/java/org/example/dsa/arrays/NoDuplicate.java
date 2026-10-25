package org.example.dsa.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class NoDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1,1,2,3,4,4,5,5};
      //  System.out.println(Arrays.toString(isUnique(nums)));
       // System.out.println(Arrays.toString(isUniqueStream(nums)));

        System.out.println(Arrays.toString(removeDuplicates(nums)));

    }

    static int[] isUnique(int[] nums){
        Set<Integer> st = new TreeSet<>();
        for(int num : nums){
            st.add(num);
        }
        int[] res = new int[st.size()];
        int i =0;
        for(int num : st){
            res[i++] = num;
        }
        return res;
    }

    static int[] isUniqueStream(int[] nums){
        return Arrays.stream(nums).distinct().sorted().toArray();
    }

    static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) return new int[]{-1};

        int k = 1;
        // next write position; nums[0] is always unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {   // new value found
                nums[k++] = nums[i];
            }
        }
        return Arrays.copyOf(nums,k);
    }
}
