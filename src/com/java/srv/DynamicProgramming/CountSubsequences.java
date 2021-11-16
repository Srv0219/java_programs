package com.java.srv.DynamicProgramming;

public class CountSubsequences {
    public static void main(String[] args) {
        String str = "abcabc";
        subsequenceABC(str);
    }

    private static void subsequenceABC(String str) {
        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                a = 2 * a + 1;
            } else if (ch == 'b') {
                ab = 2 * ab + a;
            } else if (ch == 'c') {
                abc = 2 * abc + ab;
            }
        }

        System.out.println(abc);
    }
}
