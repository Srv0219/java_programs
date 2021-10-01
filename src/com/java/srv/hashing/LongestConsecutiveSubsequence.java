package com.java.srv.hashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {3, 10, 3, 11, 4, 5, 6, 7, 8, 12};
        increasingSubsequence(arr);
    }

    private static void increasingSubsequence(int[] arr) {
        int count = 0;
        int ans = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int j = arr[i];
                while (hs.contains(j)) {
                    System.out.print(j + " ,");

                    j++;
                    count++;
                }
                System.out.println();
                 /*
                if (ans < j - arr[i]) {
                        ans = j - arr[i];
                    }*/

            }
        }
        System.out.println(ans);
    }
}
