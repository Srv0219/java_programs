package com.java.srv.DynamicProgramming;

public class MinimumCostPath {
    public static void main(String[] args) {
        int arr[][] = {
                {2, 8, 4, 1, 6, 4, 2},
                {6, 0, 9, 5, 3, 8, 5},
                {1, 4, 3, 4, 0, 6, 5},
                {6, 4, 7, 2, 4, 6, 1},
                {1, 0, 3, 7, 1, 2, 7},
                {1, 5, 3, 2, 3, 0, 9},
                {2, 2, 5, 1, 9, 8, 2}};

      /*{00, 01, 02, 03, 04, 05, 06},
        {10, 11, 12, 13, 14, 15, 16},
        {20, 21, 22, 23, 24, 25, 26},
        {30, 31, 32, 33, 34, 35, 36},
        {40, 41, 42, 43, 44, 45, 46},
        {50, 51, 52, 53, 54, 55, 56},
        {60, 61, 62, 63, 64, 65, 66}*/


        minimumCost(arr);
    }

    private static void minimumCost(int[][] arr) {
        int dp[][] = new int[arr.length][arr[0].length];
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                //last cell
                if (i == dp.length - 1 && j == dp.length - 1) {
                    dp[i][j] = arr[i][j];
                }//last column
                else if (i == dp.length - 1) {
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                }//last row
                else if (j == dp[0].length - 1) {
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j],dp[i][j+1])+arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
