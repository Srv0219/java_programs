package com.java.srv.fourFifty;

import java.util.Arrays;

public class ElementsThatAppearMoreThannkTimes2 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 5, 5, 5, 8, 7, 4, 2, 2, 3, 1, 1, 1};
        int n = arr.length;
        int k = 4;
        appearElements(arr, n, k);
    }

    public static void appearElements(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int str = 0;
        int count = 1;
        int div = n / k;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > div) {
                    System.out.println(arr[i] + " " + count);
                    count = 1;
                }
                count = 1;
            }
            str = arr[i];
        }
        if (count > div) {
            System.out.println(str + " -> " + count);
        }
    }
}
