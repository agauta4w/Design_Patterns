package org.example.dsa.stringPractice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "Hellllooooo";
        char c = 'e';
        System.out.println(freqCount(str,c));
        System.out.println(freqCountWithoutHashing(str,c));
    }

    static int freqCount(String s, char c){

        int len = s.length();
        Map<Character, Integer> frq = new HashMap<>();

        for(int i =0; i < len; i++){
             char currentChar = s.charAt(i);
            frq.put(currentChar, frq.getOrDefault(currentChar, 0)+1);
        }
        return frq.getOrDefault(c, 0);
    }

    static int freqCountWithoutHashing(String s, char c){

        int count =0;
        for (int i =0; i <s.length(); i++){
           if(s.charAt(i) == c){
               count++;
           }
        }

        return count;
    }


}
