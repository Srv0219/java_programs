package com.java.srv.practice.generic;

public class Generic <T> {
    T obj;
    Generic(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return this.obj;
    }
}
