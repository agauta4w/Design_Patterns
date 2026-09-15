package org.example.dsa.stringPractice;

public class LargestoddNum {
    public static void main(String[] args) {
        String str = "0012345678";
        System.out.println(largeOddNum(str));

    }

    public static String largeOddNum(String s) {
        int ln = s.length();
        int end = -1;

        for(int i = ln-1; i >=0; i--){
            if((s.charAt(i) - '0') % 2 != 0){
                end =i;
                break;
            }
        }
        if(end == -1){
            return "";
        }

        int start = 0;

        while(start <= end && s.charAt(start) == '0'){
            start++;
        }

        return s.substring(start, end+1);

    }
}
