package com.java.srv.fourFifty.Arrays;

public class CountInversions {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int l = 0;
        int h = arr.length - 1;
        mergeSort(l, h, arr);
    }

    private static int[] mergeSort(int l, int h, int[] arr) {
        if (l == h) {
            int base[] = new int[1];
            base[0] = arr[l];
            return base;
        }
        int mid = (l + h) / 2;
        int left[] = mergeSort(l, mid, arr);
        int right[] = mergeSort(mid + 1, h, arr);
        int merge[] = merge(left, right);
        return merge;
    }

    private static int[] merge(int[] left, int[] right) {
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int merged[] = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k] = left[i];
                i++;
                k++;
            } else {
                count = count + (left.length - i);
                merged[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            merged[k] = right[j];
            k++;
            j++;
        }
        return merged;


    }
}
