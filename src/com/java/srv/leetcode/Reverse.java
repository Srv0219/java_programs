package com.java.srv.leetcode;

public class Reverse {

    public static void main(String[] args) {
        int x = -1238938937;
        System.out.println(reverse(x));

    }

    private static int reverse(int x) {
        int rev = 0;
        int pop;
        while (x != 0) {
            pop = x % 10;
            x = x / 10;

            //-2147483648 to 2147483647
            if (rev >= Integer.MAX_VALUE / 10 && pop > 7)
                return 0;

            if (rev <= (Integer.MIN_VALUE / 10) && pop < -8)
                return 0;

            rev = (rev * 10) + pop;
        }
        return rev;

    }
}


