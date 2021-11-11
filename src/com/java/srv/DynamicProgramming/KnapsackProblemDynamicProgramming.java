package com.java.srv.DynamicProgramming;

public class KnapsackProblemDynamicProgramming {
    public static void main(String[] args) {
        int val[] = {2, 5, 1, 3, 4};
        int weight[] = {15, 14, 10, 45, 30};
        int total = 7;
        knapsack(val, weight, total);
    }

    private static void knapsack(int[] val, int[] weight, int total) {
        int dp[][] = new int[weight.length + 1][total + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if (j >= val[i - 1]) {
                    int rCap = j - val[i - 1];

                    if (dp[i - 1][rCap] + weight[i - 1] > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][rCap] + weight[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[weight.length][total]);
    }
}
