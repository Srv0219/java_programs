package com.java.srv.fourFifty.Arrays;

import java.util.Arrays;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        int K = 6;
        getPairsCount(arr, K);
    }

    public static int getPairsCount(int[] arr, int k) {
        int count = 0;
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if ((arr[l] + arr[r]) < k) {
                l++;
            } else if ((arr[l] + arr[r]) > k) {
                r--;
            } else {
                count++;
                l++;
                r--;
            }
        }
        System.out.println(count);
        return count;
    }
}
