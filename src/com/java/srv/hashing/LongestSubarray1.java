package com.java.srv.hashing;

import java.util.HashMap;

public class LongestSubarray1 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;

        longestSubArray(arr, k);
    }

    private static void longestSubArray(int[] arr, int k) {
        int sum = 0;
        int rem = 0;
        int max = Integer.MIN_VALUE;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i <= arr.length; i++) {

            sum = sum + arr[i];
            rem = sum % k;

            if (rem < 0) {
                rem += k;
            }
            if (hm.get(rem) == null) {
             //   System.out.println(hm.get(rem));
                hm.put(rem, i + 1);
            } else {
                if (rem == 0) {
                    longestSub(0, i, arr);
                } else {
                    longestSub(hm.get(rem), i, arr);
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
