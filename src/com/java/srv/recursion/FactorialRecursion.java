package com.java.srv.recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
        int a=10;
        System.out.println(factorialRecur(a));

    }

    private static int factorialRecur(int a) {

        if (a==0){
            return 1;
        }
       int str= factorialRecur(a-1);
        int ans=a*str;
        return ans;

        // return a*factorialRecur(a-1);
    }
}
