package com.java.srv.fourFifty.Strings;

import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'s', 'o', 'u', 'r', 'a','v','a','d','a','k'};
        reverseString(s);
    }

    private static void reverseString(char[] s) {
        if (s.length <= 1) {
            return;
        }
        int lo = 0;
        int hi = s.length - 1;
        while (lo < hi) {
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            lo++;
            hi--;
        }
        System.out.println(s);

        return;
    }
}
