package com.java.srv.DynamicProgramming;

public class ClimbingStairsWithMinimumMoves {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 2, 0, 2, 3, 1, 2, 2};

        minimumMoves(arr);
    }

    private static void minimumMoves(int[] arr) {
        Integer dp[] = new Integer[arr.length + 1];


        dp[arr.length] = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;

                for (int j = 1; j <= arr[i] && i+j< dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }

        for (int i=0;i< dp.length;i++){
            System.out.println(dp[i]);
        }
        System.out.println(dp[0]);
    }
}
