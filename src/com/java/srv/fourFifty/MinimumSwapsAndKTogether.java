package com.java.srv.fourFifty;

public class MinimumSwapsAndKTogether {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 5, 8, 7, 4};
        int K = 6;
        int n = arr.length;
        minSwap(arr, n, K);

    }

    public static int minSwap(int arr[], int n, int k) {
        int good = 0;
        int bad = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                good++;
            }
        }
        for (int j = 0; j < good; j++) {
            if (arr[j] > k) {
                bad++;
            }
        }

        int start = 0;
        int end = good;
        int ans = bad;
        while (end < arr.length) {
            if (arr[start] > k) {
                bad--;
            }
            if (arr[end] > k) {
                bad++;
            }

            ans = Math.min(ans, bad);
            start++;
            end++;
        }
        return ans;
    }
}
