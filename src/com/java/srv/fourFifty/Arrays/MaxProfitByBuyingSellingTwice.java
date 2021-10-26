package com.java.srv.fourFifty.Arrays;

public class MaxProfitByBuyingSellingTwice {
    public static void main(String[] args) {
        int arr[] = { 2, 30, 15, 10, 8, 25, 80 };

        stockBuyingSellingTwice(arr);
    }

    private static void stockBuyingSellingTwice(int[] arr) {
        int profit=0;
        for(int i=1;i< arr.length;i++){
            int sun=arr[i]-arr[i-1];
            if (sun>0){
                profit=profit+sun;
            }
        }
        System.out.println(profit);
    }


}
