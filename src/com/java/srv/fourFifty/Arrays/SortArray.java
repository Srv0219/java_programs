package com.java.srv.fourFifty.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};

        sortArr(arr);
    }

    private static void sortArr(int[] arr) {
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                break;
            } else if (arr[i] > arr[i + 1]) {
                val = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = val;

            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
