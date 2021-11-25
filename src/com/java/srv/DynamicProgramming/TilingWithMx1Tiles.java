package com.java.srv.DynamicProgramming;

public class TilingWithMx1Tiles {
    public static void main(String[] args) {
        int n = 8;
        int m = 3;

        int dp[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i < m) {
                dp[i] = 1;
            } else if (i == m) {
                dp[i] = 2;
            } else {
                dp[i] = dp[i - 1] + dp[i - m];
            }
        }
        System.out.println(dp[n]);
    }
}
