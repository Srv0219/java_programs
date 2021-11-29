package com.java.srv.DynamicProgramming;

public class BestTimetoBuyandSellStockswithCoolDownInfiniteTransactions {
    public static void main(String[] args) {
        int arr[] = {10, 15, 17, 20, 16, 18, 22, 20, 22, 20, 23, 25};

        buySellCoolDown(arr);
    }

    private static void buySellCoolDown(int[] arr) {
        int buy[] = new int[arr.length];
        int sell[] = new int[arr.length];
        int cool[] = new int[arr.length];
        buy[0] = arr[0];
        sell[0] = 0;
        cool[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            int bsp = arr[i] - cool[i - 1];
            if (bsp < buy[i - 1]) {
                buy[i] = bsp;
            } else {
                buy[i] = buy[i - 1];
            }

            int ssp = arr[i] - buy[i - 1];
            if (ssp > sell[i - 1]) {
                sell[i] = ssp;
            } else {
                sell[i] = sell[i - 1];
            }
            int csp = sell[i - 1];
            cool[i] = csp;
        }
        System.out.println(sell[arr.length-1]);
    }
}
