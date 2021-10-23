package com.java.srv.fourFifty;

import java.util.Arrays;

public class ThreeWayPartitioning {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int a = 1, b = 3;
        threeWayPartition(arr,a,b);
    }

    public static void threeWayPartition(int arr[], int a, int b) {
        Arrays.sort(arr);
    }
}
