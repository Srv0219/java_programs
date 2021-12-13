package com.java.srv.recursion;

public class Power2 {
    public static void main(String[] args) {
        System.out.println( powerRec(10, 8));
    }

    private static int powerRec(int x, int n) {
        if (n==0){
            return 1;
        }
        int str = powerRec(x, n / 2);
        int res = str * str;
        if (n % 2 == 1) {
            res = res * x;
        }
        return res;
    }
}
