package com.java.srv.hashing;

import java.util.HashMap;

class PrintinglongestIncreasingconsecutive {

    public static void main(String[] args) {
        int[] a = {3, 10, 3, 11, 4, 5, 6, 7, 8, 12,13,14,15,16,17,18,19};
        int n = a.length;
        longestSubsequence(a, n);
    }
    public static void longestSubsequence(int[] a, int n) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] dp = new int[n];
        int maximum = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < n; i++) {

            if (mp.get(a[i] - 1) != null) {
                int lastIndex = mp.get(a[i] - 1) - 1;
                dp[i] = 1 + dp[lastIndex];
            } else
                dp[i] = 1;
                mp.put(a[i], i + 1);

            if (maximum < dp[i]) {
                maximum = dp[i];
                index = i;
            }
        }

         int count=0;
        for (int i = a[index] - maximum + 1; i <= a[index]; i++) {
            count++;
            System.out.print(i + " ");
        }
        System.out.print(count);
    }

    // Driver Code

}

// This code is contributed by sanjeev2552
