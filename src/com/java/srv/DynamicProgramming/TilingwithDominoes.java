package com.java.srv.DynamicProgramming;

public class TilingwithDominoes {
    public static void main(String[] args) {
        int n = 4;
        tilingDominoes(n);
    }

    private static void tilingDominoes(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }
}
