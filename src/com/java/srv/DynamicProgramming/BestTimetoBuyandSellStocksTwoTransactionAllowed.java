package com.java.srv.DynamicProgramming;

public class BestTimetoBuyandSellStocksTwoTransactionAllowed {
    public static void main(String[] args) {
        int arr[] = {30, 40, 43, 50, 45, 20, 26, 40, 80, 50, 30, 15, 10, 20, 40, 45, 71, 50, 55};
        buySellStocksTwoTransactions(arr);

    }

    private static void buySellStocksTwoTransactions(int[] arr) {
        int lr[] = new int[arr.length];
        int rl[] = new int[arr.length];

        int subl = 0;
        int low = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < low) {
                low = arr[i];
            }
            subl = arr[i] - low;
            if (subl > lr[i - 1]) {
                lr[i] = subl;
            } else {
                lr[i] = lr[i - 1];
            }
        }

        int subh = 0;
        int high = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > high) {
                high = arr[i];
            }
            subh = high - arr[i];
            if (subh > rl[i + 1]) {
                rl[i] = subh;
            } else {
                rl[i] = rl[i + 1];
            }
        }
        int str = 0;
        for (int i = 0; i < arr.length; i++) {
            int add = lr[i] + rl[i];
            if (add > str) {
                str = add;
            }
        }
        System.out.println(str);
    }
}
