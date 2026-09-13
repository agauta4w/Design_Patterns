package org.example.dsa.hashing;

public class BasicHashing {
    public static void main(String[] args) {
        int[] arr = {5,6,7,3,4,5,6,7,6,6,8,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6};
        int n1 =6;
       // countFrequency(arr, n);
       // countFrequencyUsingHashing(arr,n1);

        int num = 12345;
        System.out.println(countDigit(num));
        System.out.println(countOddDigit(num));
        System.out.println(revNum(num));
        System.out.println(largestDigit(num));
    }

    static void countFrequency(int[] nums, int n){
        int count = 0;

        for(int num : nums){
            if (num == n) count++;
        }
        System.out.println(count);
    }

    static void  countFrequencyUsingHashing(int[] arr, int a){
        int[] nums = new int[10];
        for (int num : arr) {
            nums[num]++;
        }
        System.out.println(nums[a]);
    }

    static int countDigit(int n){
        int count =0;
        while (n > 0){
            n = n/10;
            count++;
        }
        return count;
    }

    static int countOddDigit(int n){
        int count =0;
        while (n > 0){
            int digit = n%10;
            if(digit % 2 != 0){
                count++;
            }
            n = n/10;

        }
        return count;
    }

    static int revNum(int n){
        int revNum =0;
        while (n>0){
            int digit = n%10;
            n = n/10;
            revNum = revNum*10 + digit;
        }
        return revNum;
    }

    static int largestDigit(int n){
        int largest = Integer.MIN_VALUE;
        while(n > 0){
            int digit = n%10;
            n = n/10;
            if(digit > largest){
                largest = digit;
            }
        }
        return largest;
    }
}
