package com.java.srv.DynamicProgramming;

public class CountStairPath {
    public static void main(String[] args) {
        int n = 10;
        int qb[] = new int[n + 1];
        System.out.println(countPath(n, qb));
        System.out.println(countPathTabulation(n));
    }

    private static int countPath(int n, int[] qb) {

        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (qb[n] > 0) {
            return qb[n];
        }
        int c1 = countPath(n - 1, qb);
        int c2 = countPath(n - 2, qb);
        int c3 = countPath(n - 3, qb);

        int c = c1 + c2 + c3;
        qb[n] = c;
        return c;
    }

    private static int countPathTabulation(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }

        return dp[n];
    }
}
