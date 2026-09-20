package org.example.dsa.stringPractice;

public class CountWords {

    public static void main(String[] args) {

        String str = "     Java is a Backend Language";

        System.out.println(countWords(str));
    }

    static int countWords(String s) {

        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!Character.isWhitespace(ch)) {

                if (!inWord) {
                    count++;
                    inWord = true;
                }

            } else {
                inWord = false;
            }
        }

        return count;
    }

}
