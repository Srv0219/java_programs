package com.java.srv.DynamicProgramming;

public class BestTimeToBuySellStocks {
    public static void main(String[] args) {
        int arr[] = {11, 6, 19, 6, 1, 6, 18, 4};

        buySellStock(arr);
    }

    private static void buySellStock(int[] arr) {
        int lp = Integer.MAX_VALUE; //least price
        int op = 0; //optimal price
        int pist = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lp) {
                lp = arr[i];
            }
            pist = arr[i] - lp;
            if (pist > op) {
                op = pist;
                System.out.println("Buy : " + lp + " Sell : " + arr[i] + " Profit : " + op);
            }
        }
        System.out.println(op);
    }
}
