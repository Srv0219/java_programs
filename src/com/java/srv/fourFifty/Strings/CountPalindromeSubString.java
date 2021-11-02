package com.java.srv.fourFifty.Strings;

public class CountPalindromeSubString {
    public static void main(String[] args) {
        String S = "aaaabbaa";

        palindromicSubstring(S);
    }

    private static void palindromicSubstring(String s) {
        int count=0;
        boolean dp[][] = new boolean[s.length()][s.length()];
        for (int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < dp.length; i++, j++) {

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

                if ( dp[i][j]==true){
                    count++;
                }
            }

        }

        System.out.println(count);
    }
}
