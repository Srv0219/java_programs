package com.java.srv.Exam;

public class SequentialInteger {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 2, 1, 10};
        int k = 11;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    printValue(arr,i,j);
                    System.out.println();
                }else if (sum>k){
                    break;
                }
            }
        }
    }

    private static void printValue(int[] arr, int i, int j) {
        for (int p = i; p <= j; p++) {
            System.out.print(arr[p]+", ");
        }
    }
}
