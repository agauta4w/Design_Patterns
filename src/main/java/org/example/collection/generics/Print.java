package org.example.collection.generics;

import java.util.List;

public class Print<T> {
    public static void main(String[] args) {
        Print<Integer> print = new Print<>();
        print.setPrint(10);
        //System.out.println(print.getPrint());

        Print<String> printName = new Print<>();
        printName.setPrint("Ayush");
        print.setPrint(1);
        //System.out.println(print.getPrint());
        //System.out.println(printName.getPrint());

        Print<List<Integer>> printList = new Print<>();
        printList.setPrint(List.of(1,2,3,4,5));
        System.out.println(printList.getPrint());
    }

    T value;

    public T getPrint(){
        return value;
    }

    public void setPrint(T value){
        this.value = value;
    }
}
