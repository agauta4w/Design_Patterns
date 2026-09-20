package org.example.dsa.stringPractice;

public class LastChar {
    public static void main(String[] args) {
        String Str = " Ayush Gautam";
        System.out.println(lastChar(Str));
    }

    static char lastChar(String s){
        if(s== null || s.isEmpty()){
            return '0';
        }
        int len = s.length();
        for(int i = len-1 ; i >= 0; i--){
           if(s.charAt(i) != ' ') {
               return s.charAt(i);
           }
        }

        for(int i = len-1 ; i>=0; i--){
            if(!Character.isWhitespace(s.charAt(i))){
                return s.charAt(i);
            }
        }
        return '0';
    }
}
