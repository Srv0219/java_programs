package com.java.srv.leetcode;

public class Palindrome {

    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        Boolean bool = false;
        int b;
        int c = 0;
        int temp = x;
        while (x != 0) {
            b = x % 10;
            x = x / 10;

            c = c * 10 + b;
        }
        String st = String.valueOf(c);
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '-') {
                return false;
            }
        }

        if (temp == c) {
            bool = true;
        }

        return bool;
    }
}
