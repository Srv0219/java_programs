package com.java.srv.DynamicProgramming;

public class BestTimetoBuyandSellStockswithTransactionFeeInfiniteTransactions {
    public static void main(String[] args) {
        int arr[] = {10, 15, 17, 20, 16, 18, 22, 20, 22, 20, 23, 25};
        int fee = 3;

        buySellStockWithFee(arr, fee);
    }

    private static void buySellStockWithFee(int[] arr, int fee) {
        int buy[] = new int[arr.length];
        int sell[] = new int[arr.length];
        buy[0] = arr[0];
        sell[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            int bsp = arr[i] - sell[i - 1];
            if (bsp < buy[i - 1]) {
                buy[i] = bsp;
            } else {
                buy[i] = buy[i - 1];
            }
            int ssp = arr[i] - buy[i - 1] - fee;
            if (ssp > sell[i - 1]) {
                sell[i] = ssp;
            } else {
                sell[i] = sell[i - 1];
            }
        }
    }
}
