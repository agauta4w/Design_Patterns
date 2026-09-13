package org.example.dsa.patternagain;

public class pattern{
    public static void main(String[] args) {
       // pattern10(5);
        pattern11(5);

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
}
