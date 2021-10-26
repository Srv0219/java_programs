package com.java.srv.fourFifty.Arrays;

public class MinimumSwapsAndKTogether2 {
    public static void main(String[] args) throws Exception {
        int arr[] = {2, 1, 5, 6, 3};
        int K = 3;
        int n = arr.length;
        minSwap(arr, n, K);
    }

    private static int minSwap(int[] arr, int n, int k) {
        int good = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                good++;
            }
        }
        for (int i = 0; i <= good; i++) {
            if (arr[i] > k) {
                ans++;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
