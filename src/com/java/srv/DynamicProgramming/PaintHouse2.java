package com.java.srv.DynamicProgramming;

public class PaintHouse2 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 5, 7, 2, 3, 4},
                {5, 8, 4, 3, 6, 1},
                {3, 2, 9, 7, 2, 3},
                {1, 2, 4, 9, 1, 7}};
        int color = 5;
        paintHouse(arr, color);
    }

    private static void paintHouse(int[][] arr, int color) {
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;
        int dp[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            dp[0][i] = arr[0][i];
            if (arr[0][i] <= s1) {
                s2 = s1;
                s1 = arr[0][i];
            } else if (arr[0][i] <= s2) {
                s2 = arr[0][i];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            int n1 = Integer.MAX_VALUE;
            int n2 = Integer.MAX_VALUE;
            for (int j = 0; j < dp[0].length; j++) {
                if (s1 == dp[i - 1][j]) {
                    dp[i][j] = s2 + arr[i][j];
                } else {
                    dp[i][j] = s1 + arr[i][j];
                }

                if (dp[i][j] <= n1) {
                    n2 = n1;
                    n1 = dp[i][j];
                } else if (dp[i][j] <= n2) {
                    n2 = dp[i][j];
                }
            }
            s1 = n1;
            s2 = n2;
        }

        System.out.println(s1);

    }
}
