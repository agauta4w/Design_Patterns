package org.example.dsa.stringPractice;

public class DigitCheck {
    public static void main(String[] args) {
        String str = "12345";
        String  strdig = "di12314";
        System.out.println(isDigit(str));
        System.out.println(isDigit(strdig));


    }

    static boolean isDigit(String str){

        for(int i =0; i < str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }

    static boolean isDigitUsingInbuiltFunction(String str){
        //edge case check
        if (str == null || str.isEmpty()) {
            return false;
        }
        //Character.isDigit(ch);
        for(int i =0; i < str.length()-1; i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }

}
