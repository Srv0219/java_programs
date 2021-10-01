package com.java.srv.leetcode;

import java.util.HashMap;

public class RomanNumber {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int add = 0;
        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length()-1 && hs.get(s.charAt(i)) < hs.get(s.charAt(i + 1))) {
                add = add + (hs.get(s.charAt(i + 1)) - hs.get(s.charAt(i)));
                i++;
                continue;
            } else {
                add = add + hs.get(s.charAt(i));
            }
        }

        return add;
    }
}
