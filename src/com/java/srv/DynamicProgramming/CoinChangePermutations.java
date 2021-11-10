package com.java.srv.DynamicProgramming;

public class CoinChangePermutations {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6};
        int tar = 10;

        permutation(arr, tar);

    }

    private static void permutation(int[] arr, int tar) {
        int dp[] = new int[tar + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]<=i) {
                    dp[i] = dp[i] + dp[i - arr[j]];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}

