package com.java.srv.OopsConcept;


// static polymorphism , Compile time polymorphism


public class polymorphism {
    public static void main(String[] args) {

        add(10,20);
        add(10.0f,20.0f);
    }

    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(float a,float b){
        System.out.println(a+b);
    }
}
