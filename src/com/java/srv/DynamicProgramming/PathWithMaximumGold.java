package com.java.srv.DynamicProgramming;

public class PathWithMaximumGold {
    public static void main(String[] args) {
        int arr[][] = {
                {0, 1, 4, 2, 8, 2},
                {4, 3, 6, 5, 0, 4},
                {1, 2, 4, 1, 4, 6},
                {2, 0, 7, 3, 2, 2},
                {3, 1, 5, 9, 2, 4},
                {2, 7, 0, 8, 5, 1}
        };
        /*{00, 01, 02, 03, 04, 05},
        {10, 11, 12, 13, 14, 15},
        {20, 21, 22, 23, 24, 25},
        {30, 31, 32, 33, 34, 35},
        {40, 41, 42, 43, 44, 45},
        {50, 51, 52, 53, 54, 55},
        {60, 61, 62, 63, 64, 65}*/
        maxGold(arr);
    }

    private static void maxGold(int[][] arr) {
        int dp[][] = new int[arr.length][arr[0].length];


        for (int j = dp[0].length - 1; j >= 0; j--) {
            for (int i = dp.length - 1; i >= 0; i--) {

                if (j == dp[0].length - 1) {
                    dp[i][j] = arr[i][j];
                } else if (i == 0) {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j + 1]) + arr[i][j];
                } else if (i == arr.length - 1) {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i - 1][j + 1]) + arr[i][j];
                } else {
                    dp[i][j] = Math.max(Math.max(dp[i - 1][j + 1], dp[i][j + 1]), dp[i + 1][j + 1]) + arr[i][j];
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i][0]);
        }
        System.out.println(max);
    }
}
