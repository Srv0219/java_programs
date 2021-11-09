package com.java.srv.DynamicProgramming;

public class CoinChangeCombinationMinimumNumberOfCoins {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5};
        int tar = 7;

        combination(arr, tar);

    }

    private static void combination(int[] arr, int tar) {
        int dp[] = new int[tar + 1];
        dp[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] = dp[j] + dp[j - arr[i]];
            }
        }
        System.out.println(dp[tar]);
    }
}
