package com.java.srv.fourFifty;

import java.util.Arrays;

public class MinMaxDifferenceBetweenHeights {
    public static void main(String[] args) {
        int K = 2, N = 4;
        int arr[] = {1, 5, 8, 10};

        getMinDiff(arr, N, K);
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        int min;
        if ((arr[0] - k) < 0) {
            min = arr[0] + k;
        } else {
            min = arr[0] - k;
        }

        int max = min;
        int sum_diff = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] - k) < 0) {
                sum_diff = arr[i] + k;
            } else {
                sum_diff = arr[i] - k;
            }

            if (sum_diff < min) {
                min = sum_diff;
            } else {
                min = min;
            }

            if (sum_diff > min) {
                max = sum_diff;
            } else {
                max = max;
            }

        }
        System.out.println(max - min);
        return max - min;
    }
}
