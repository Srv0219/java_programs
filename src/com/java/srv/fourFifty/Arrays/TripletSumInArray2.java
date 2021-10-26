package com.java.srv.fourFifty.Arrays;

import java.util.HashSet;

public class TripletSumInArray2 {
    public static void main(String[] args) {
        int x = 13;
        int arr[] = {1, 4, 45, 6, 10, 8};

       boolean b= findTripletSum(arr, x);
        System.out.println(b);
    }

    private static boolean findTripletSum(int[] arr, int x) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = x - (arr[i] + arr[j]);
                if (sum != arr[i] && sum != arr[j]) {
                    if (hs.contains(sum)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
