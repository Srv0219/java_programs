package com.java.srv.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {9, 43, 34, 2, 5, 8, 3, 1, 57};
        int a = 0;

        int temp[] = bubbleSort(arr, a);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }

    private static int[] bubbleSort(int[] arr, int a) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }
}
