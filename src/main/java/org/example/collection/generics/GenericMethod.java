package org.example.collection.generics;

public class GenericMethod {

    public <K,V> void printValue(Para<K,V> pair, Para<K,V> pair2){

        if(pair.getValue().equals(pair2.getValue())){
            return;
        }

    }


    static  class Para<K,V>{
        public K key;
        public V value;

         void setValue(K key, V value){
            this.key = key;
            this.value= value;
        }

        Para<K,V> getValue(){
             return this;
        }
    }
}
