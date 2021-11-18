package com.java.srv.DynamicProgramming;

public class MaximumSumNonAdjacentElements {
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 100, 5, 6};
        int inc = 0;
        int exc = 0;
        maximumSumNonAdjacent(arr, inc, exc);
    }

    private static void maximumSumNonAdjacent(int[] arr, int inc, int exc) {
        int dp[][] = new int[2][arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                dp[0][i] = arr[i];
            } else {
                dp[0][i] = arr[i] + dp[1][i-1];
                dp[1][i] = Math.max(dp[0][i-1], dp[1][i-1]);
            }
        }
        System.out.println(Math.max(dp[0][arr.length-1],dp[1][arr.length-1]));
    }
}
