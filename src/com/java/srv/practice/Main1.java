package com.java.srv.practice;

public class Main1 {
    int x=1;

    public static void main(String[] args) {
        Main1 m1= new Main1();
        Main2 m2 = new Main2();
        int z= Main2.exampleObject(4,3);
        System.out.println(m1.x+" "+z);
    }
}
