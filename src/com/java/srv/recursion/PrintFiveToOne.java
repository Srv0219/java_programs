package com.java.srv.recursion;

public class PrintFiveToOne {
    public static void main(String[] args) {

        oneToFive(5);
    }

    private static void oneToFive(int a) {
        if(a>0){
            System.out.println(a+" ");
            oneToFive(a-1);

        }
        return;

    }
}