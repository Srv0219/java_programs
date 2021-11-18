package com.java.srv.DynamicProgramming;

public class PaintHouse {
    public static void main(String[] args) {
        int house = 4;
        int arr[][] = {
                {1, 5, 7},
                {5, 8, 4},
                {3, 2, 9},
                {1, 2, 4}};

        paintHouse(house, arr);
    }

    private static void paintHouse(int house, int[][] arr) {
        int dp[][] = new int[house][3];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = arr[i][j];
                } else if (j == 0) {
                    dp[i][j] = arr[i][j] + Math.min(dp[i - 1][j + 1], dp[i - 1][j + 2]);
                } else if (j == 1) {
                    dp[i][j] = arr[i][j] + Math.min(dp[i - 1][j - 1], dp[i - 1][j + 1]);
                } else if (j == 2) {
                    dp[i][j] = arr[i][j] + Math.min(dp[i - 1][j - 2], dp[i - 1][j - 1]);
                }
            }
        }
        int min=dp[house-1][0];
        for (int i = 1; i < 3; i++){
            min=Math.min(dp[house-1][i],min);
        }
        System.out.println(min);
    }
}
