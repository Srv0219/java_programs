package com.java.srv.recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int a=10;
        fibonacciRecur(a);

    }
    private static int fibonacciRecur(int a) {

        if (a==0){
            return 0;
        }

        int str= a+fibonacciRecur(a-1);
        System.out.println(str+" + "+ a +" = "+str);
        return str;

    }
}
