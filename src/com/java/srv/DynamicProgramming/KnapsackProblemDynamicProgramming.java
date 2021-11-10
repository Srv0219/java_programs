package com.java.srv.DynamicProgramming;

public class KnapsackProblemDynamicProgramming {
    public static void main(String[] args) {
        int val[]={2,5,1,3,4};
        int weight[]={15,14,10,45,30};
        int total=7;
        knapsack(val,weight,total);
    }

    private static void knapsack(int[] val, int[] weight, int total) {
        int dp[][]= new int[total+1][weight.length+1];
        for (int i=1;i< dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j];
                if (j>=weight[i-1]){

                }
            }
        }

    }
}
