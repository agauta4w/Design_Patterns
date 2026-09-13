package org.example.collection.generics;

public class Casting {
    public static void main(String[] args) {
        byte b = 1;
        int i = b;
        char c = 's';
        String s = String.valueOf(c);
        System.out.println(i);
        System.out.println(s);


        //String s = "Hello";

        Pair p1 = new Pair(2,3);

        System.out.println(p1.first+ ", " + p1.second);

        Pair p2 = new Pair("Ayush","Gautam");
        System.out.println(p2.first+ ", " + p2.second);



    }
    static class Pair<T>{

        T first ;
        T second;

        public Pair(T first, T second){
            this.first = first;
            this.second = second;
        }
    }
}
