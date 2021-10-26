package com.java.srv.fourFifty.Arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int M = 5;
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        chocolateDistribution(arr,M);
    }

    private static void chocolateDistribution(int[] arr, int m) {
        int  ansmin=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i=0;i< arr.length-m;i++){
            int min=arr[i];
            int max=arr[i+m-1];
            int gap = max-min;

            if (gap<ansmin){
                ansmin=gap;
            }
            System.out.println(ansmin);
        }
    }
}
