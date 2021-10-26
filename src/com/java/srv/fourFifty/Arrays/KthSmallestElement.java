package com.java.srv.fourFifty.Arrays;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k=3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
