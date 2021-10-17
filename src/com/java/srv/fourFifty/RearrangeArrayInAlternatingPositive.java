package com.java.srv.fourFifty;

import java.util.Arrays;

public class RearrangeArrayInAlternatingPositive {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, -1, 4};
        rearraangeArray(arr);
    }

    private static void rearraangeArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.println(Math.abs(arr[i]) + " " + Math.abs(arr[i - 1]));
                if (Math.abs(arr[i]) == Math.abs(arr[i - 1])) {
                    i++;
                }
            }
            for (int j = i + 1; j < arr.length; j++) {
                int swap;
                if (arr[i] + arr[j] == 0) {

                    swap = arr[j];
                    arr[j] = arr[i + 1];
                    arr[i + 1] = swap;
                }
                if (Math.abs(arr[i]) == Math.abs(arr[i + 1]) && arr[i] > arr[i + 1]){
                    swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                }

            }
        }
    }
}
