package org.example.dsa.patternagain;

public class pattern {
    public static void main(String[] args) {
//        pattern10(5);
//        pattern11(5);
//        pattern1(4);

        pattern13(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int row =1; row <= n; row++){
            for(int col =  1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row =1; row <= n; row++){
            for(int col =  row; col <= n-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int row =1 ; row <= n; row++){
            int start =0;
            if (row %2 != 0){
                start =1;
            }
            for(int col = 1; col <= row; col++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            for (int col = 1; col <= (2 * n - 2 * row); col++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        int num =1;
            for(int row = 1; row <= n; row++){
                for(int col = 1; col <= row ; col++){
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
    }

}
