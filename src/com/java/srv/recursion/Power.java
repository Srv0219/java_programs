package com.java.srv.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(powerRec(4, 5));
    }

    private static int powerRec(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int str = powerRec(x, n - 1);
        int res = x * str;
        return res;
    }
}
