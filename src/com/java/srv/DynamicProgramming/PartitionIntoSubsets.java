package com.java.srv.DynamicProgramming;

public class PartitionIntoSubsets {
    public static void main(String[] args) {
        int n = 5;//people
        int k = 4;//teams
        int dp[][] = new int[k + 1][n + 1];
        partitionSubset(n, k, dp);
    }

    private static void partitionSubset(int n, int k, int[][] dp) {

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    dp[i][j] = 1;
                } else if (j < i) {
                    dp[i][j] = 0;
                } else if (i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i][j - 1] * i) + dp[i - 1][j - 1];
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}
