package org.example.dsa.stringPractice;

public class CountVowelCons {
    public static void main(String[] args) {

        String str = "Chetan 123!$";
        count(str);
    }

    static boolean isVowel(Character c){
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    static void count(String s){
        int vowelCount =0, constCount = 0;

        for(int i=0 ; i < s.length()-1; i++ ){
            char c = Character.toLowerCase(s.charAt(i));

            if(!Character.isLetter(c)){
                continue;
            }
            if(isVowel(c)){
                vowelCount++;
            } else
                constCount++;
        }

        System.out.println("Total no of vowels in this string is : " + vowelCount);
        System.out.println("Total no of Consonant in this string is : " + constCount);

    }
}
