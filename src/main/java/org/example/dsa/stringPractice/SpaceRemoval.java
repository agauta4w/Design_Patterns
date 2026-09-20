package org.example.dsa.stringPractice;

public class SpaceRemoval {
    public static void main(String[] args) {
        String greet = " Hello Ayush, Good Morning!";
        System.out.println(firstChar(greet));
    }

    static String spaceTrimmed(String str){
       StringBuilder sb = new StringBuilder();
       for(char ch : str.toCharArray()){
           if(ch != ' '){
               sb.append(ch);
           }
       }
       return sb.toString();
    }

    static String usingArray(String str){
        int index =0;
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != ' '){
                arr[index++] = arr[i];
            }
        }
        return new String(arr, 0, index);
    }

    static char firstChar(String s){
        if(s == null || s.isEmpty() ){
            return '0';
        }
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                return s.charAt(i);
            }
        }
        return '0';
    }
}
