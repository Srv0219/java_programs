package com.java.srv.fourFifty.Arrays;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        maxProfit(arr);
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] - min > max)
                max = prices[i] - min;
        }
        return max;

    }
}
