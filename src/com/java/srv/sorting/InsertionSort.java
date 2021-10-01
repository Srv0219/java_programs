package com.java.srv.sorting;
/*
        Time Complexity:O(n^2)
        Auxiliary Space:O(1)
*/

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {9, 43, 34, 2, 5, 8, 3, 1, 57};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
