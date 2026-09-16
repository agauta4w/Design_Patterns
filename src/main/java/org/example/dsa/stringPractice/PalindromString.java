package org.example.dsa.stringPractice;

public class PalindromString {
    public static void main(String[] args) {
        String s = "abcddcba";
        System.out.println(palindromCheck(s));

    }

    static boolean palindromCheck(String s){
        int end = s.length()-1;
        int start =0;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
