package com.java.srv.DynamicProgramming;

import java.util.ArrayList;

public class BestTimeBuySellStocksInfiniteTransactions {
    public static void main(String[] args) {
        int arr[] = {11, 6, 7, 19, 6, 1, 6, 18, 4};

        buySellStockInfiniteTrans(arr);
    }

    private static void buySellStockInfiniteTrans(int[] arr) {
        int buy = 0;
        int sell = 0;
        int profit = 0;

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                sell++;
            } else {
                profit = profit + arr[sell] - arr[buy];
                al.add(profit);
                buy = sell = i;

            }
        }
        profit = profit + arr[sell] - arr[buy];
        System.out.println(profit);

    }
}
