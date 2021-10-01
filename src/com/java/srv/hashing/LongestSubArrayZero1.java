package com.java.srv.hashing;

import java.util.HashMap;

public class LongestSubArrayZero1 {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        subArrayZero(arr);
    }

    private static void subArrayZero(int[] arr) {
        int sum = 0;
//        int rem = 0;
//        int max = Integer.MIN_VALUE;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (hm.get(sum) == null) {
                hm.put(sum, i + 1);
            } else {
                if (sum == 0) {
                    longestSub(0, i, arr);
                } else {
                    longestSub(hm.get(sum), i, arr);
                }
            }
        }
    }

    private static void longestSub(int start, Integer end, int[] arr) {
        int endparse = end;
        for (int j = start; j <= endparse; j++) {
            System.out.print(arr[j] + ",");
        }
        System.out.println();
    }
}
