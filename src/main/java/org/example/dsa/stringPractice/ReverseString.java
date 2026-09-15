package org.example.dsa.stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
//        List<Character> c = List.of('h','e','l','l','o');
//        //revString(s);
//        reverseString(c);

        List<Character> str =
                new ArrayList<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));

        // Creating an instance of Solution class
        ReverseString sol = new ReverseString();

        // Function call to reverse the string
        sol.reverseString(str);

        for (char c : str) {
            System.out.print(c);
        }
    }

    public static void revString(String s){
        int len = s.length();
        String result = "";
        for(int i = len-1; i >=0; i--){
            result += s.charAt(i);
        }
        System.out.println(result);
    }


    public  void reverseString(List<Character> s) {
        int start = 0, end = s.size() -1;
        while (start < end){
            char ch = s.get(start);
            s.set(start,s.get(end));
            s.set(end, ch);
            end--;
            start++;
        }
    }
}
