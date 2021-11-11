package com.java.srv.DynamicProgramming;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int val[] = {2, 5, 1, 3, 4};
        int weight[] = {15, 14, 10, 45, 30};
        int total = 7;

        unboundedKnapsack(val, weight, total);
    }

    private static void unboundedKnapsack(int[] val, int[] weight, int total) {
        int dp[] = new int[total + 1];
        dp[0] = 0;
        int max = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < weight.length; j++) {
                if (val[j] <= i) {
                    int tbag = dp[i - val[j]] + weight[j];
                    if (tbag>max){
                        max=tbag;
                    }
                }
            }
            dp[i]=max;
        }
        System.out.println(dp[total]);
    }
}
