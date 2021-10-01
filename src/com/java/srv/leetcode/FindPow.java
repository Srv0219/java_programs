package com.java.srv.leetcode;

public class FindPow {
    public static void main(String[] args) {
        double x = 23;
        int n = -4;
        myPow(x, n);
    }

    public static double myPow(double x, int n) {
        double res = 1;
        double pow = x;
        while (n != 0) {
            if (n % 2 == 1) {
                res = res * pow;
            }
            if (n % 2 == -1) {
                res = res / pow;
            }
            n = n / 2;
            pow = pow * pow;
        }
        return res;
    }
}
