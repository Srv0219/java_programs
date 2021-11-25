package com.java.srv.DynamicProgramming;

public class FriendsPairingProblem {
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] * (i - 1);
        }
        System.out.println(dp[n]);

    }
}
