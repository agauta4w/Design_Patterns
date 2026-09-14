package org.example.dsa.stringPractice;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        revString(s);

    }

    public static void revString(String s){
        int len = s.length();
        String result = "";
        for(int i = len-1; i >=0; i--){
            result += s.charAt(i);
        }
        System.out.println(result);
    }


    public void reverseString(List<Character> s) {

    }
}
