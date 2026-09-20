package org.example.dsa.stringPractice;

public class LowerToUpperCase {
    public static void main(String[] args) {

    }

    static String toUpperCase(String s){
        StringBuilder sb = new StringBuilder();

        for(int i =0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char) (ch +32);
                sb.append(ch);
            }
        }
       return sb.toString();
    }
}
