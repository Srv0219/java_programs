package com.java.srv.sorting;

public class QuickSort {
    public static void main(String[] args) {

        int arr[] = {5, 2, 32, 4, 56, 3, 6, 8, 10, 15};
        int low = 0;
        int high = arr.length;
        quickSort(arr, low, high - 1);
        System.out.println("Sorted array : ");
        printArray(arr, high);
    }

    private static void printArray(int[] arr, int high) {
        for (int i = 0; i < high; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
