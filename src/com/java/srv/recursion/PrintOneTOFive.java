package com.java.srv.recursion;

public class PrintOneTOFive {
    public static void main(String[] args) {

        oneToFive(5);
    }

    private static void oneToFive(int a) {
        if(a>0){
            oneToFive(a-1);
            System.out.println(a+" ");
        }
        return;

    }
}
