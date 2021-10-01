package com.java.srv.leetcode;

public class FindDifferenceThree {

    public static void main(String[] args) {

        String s = "ae";
        String t = "aea";

        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        char c = t.charAt(s.length());
        for (int i = 0; i < s.length(); ++i) {
            c ^= sarr[i];
            c ^= tarr[i];
        }
        return c;
    }
}
