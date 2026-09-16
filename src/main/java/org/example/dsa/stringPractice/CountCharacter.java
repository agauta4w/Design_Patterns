package org.example.dsa.stringPractice;

public class CountCharacter {
    public static void main(String[] args) {
        String name = "Priyaranjan";
        System.out.println(stringLength(name));

    }

    static  int stringLength(String s){
        int count =0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch (StringIndexOutOfBoundsException e){}
        return count;
    }
}
