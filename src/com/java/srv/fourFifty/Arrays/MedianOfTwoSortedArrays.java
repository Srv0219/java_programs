package com.java.srv.fourFifty.Arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {-5, 3, 6, 12, 15};
        int arr2[] = {-12, -10, -6, -3, 4, 10};
        twoMedian(arr1, arr2);
    }

    private static int twoMedian(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        Arrays.sort(arr3);
        int n = arr3.length;
        if (n % 2 != 0) {
            System.out.println(arr3[(n) / 2]);
            return arr3[(n) / 2];
        }
        System.out.println((arr3[n / 2] + arr3[(n / 2) - 1]) / 2);
        return (arr3[n / 2] + arr3[(n / 2) - 1]) / 2;

    }
}
