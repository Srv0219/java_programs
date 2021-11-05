package com.java.srv.DynamicProgramming;

public class ClimbingStairsWithJump {
    public static void main(String[] args) {
        int arr[] = {13, 5, 5, 2, 4, 1, 5, 9, 8, 6, 3, 8, 9, 1};

        climbStairs(arr);
    }

    private static void climbStairs(int[] arr) {
        int dp[] = new int[arr.length + 1];
        dp[arr.length] = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                dp[i] = dp[i] + dp[i + j];
            }
        }
        System.out.println(dp[1]);
    }
}
