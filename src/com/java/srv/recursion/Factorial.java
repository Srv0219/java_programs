package com.java.srv.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(recursionFactorial(5));
    }

    private static int recursionFactorial(int i) {

        if (i == 1) {
            return 1;
        }
        System.out.println(i);
        int fact = recursionFactorial(i - 1);
        int res = i * fact;
        return res;
    }
}
