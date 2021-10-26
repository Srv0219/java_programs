package com.java.srv.fourFifty.Arrays;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        merge(arr1, arr2);
    }

    private static void merge(int[] arr1, int[] arr2) {
        int str;
        int j=0;
        for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] > arr2[j]) {
                    str = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = str;
                }
                Arrays.sort(arr2);
        }
    }
}
