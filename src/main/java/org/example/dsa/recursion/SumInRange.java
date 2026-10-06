package org.example.dsa.recursion;

public class SumInRange {
    public static void main(String[] args) {
        System.out.println(sumWithoutRec(1, 5));
        System.out.println(sumUsingRec(1, 5));
    }

    static int sumWithoutRec(int a, int b){
        int sum =0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }

    static int sumUsingRec(int a , int b){
        if(b == a){
            return a;
        }
        return b + sumUsingRec(a, b - 1);
    }
}
