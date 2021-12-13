package com.java.srv.practice.generic;

public class GenericTwo<T,V> {
    T obj1;
    V obj2;

    GenericTwo(T obj1,V obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
