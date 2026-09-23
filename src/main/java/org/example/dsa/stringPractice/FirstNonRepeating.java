package org.example.dsa.stringPractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String name = "llama";
        System.out.println(nonRepUsingMap(name));
        System.out.println(repeating(name));
        System.out.println(repeatingUsingMap(name));


    }
    static  char nonRepUsingMap(String s){

        Map<Character, Integer> frq = new HashMap<>();

        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            frq.put(ch, frq.getOrDefault(ch, 0)+1);
        }

        for(char c : s.toCharArray()){
            if(frq.get(c) ==1){
                return c;
            }
        }
        return '0';
    }

    static  char repeatingUsingMap(String s){

        Map<Character, Integer> frq = new HashMap<>();

        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            frq.put(ch, frq.getOrDefault(ch, 0)+1);
        }

        for(char c : s.toCharArray()){
            if(frq.get(c) > 1){
                return c;
            }
        }
        return '0';
    }

    static char nonRepeating(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isRepeating = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && ch == s.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return ch;
            }
        }
        return '0';
    }

    static char repeating(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isRepeating = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && ch == s.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (isRepeating) {
                return ch;
            }
        }
        return '0';
    }
}
