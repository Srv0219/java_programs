package com.java.srv.Exam;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String s = "kayakabcradarabracecarxyrevivera";
        longestPalSubStr(s);
    }

    private static void longestPalSubStr(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        int len = 0;
        for (int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < s.length(); i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                }
                if (dp[i][j]) {
                    len = g + 1;
                }
            }
        }

    }
}
