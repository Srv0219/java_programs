package com.java.srv.fourFifty;

import java.util.ArrayList;

public class MaximumProductSubarray2 {
    public static void main(String[] args) {
        int[] arr = {8, -2, -2, 0, 8, 0, -6, -8, -6, -1};
        maxProductSubarray(arr);
    }

    private static long maxProductSubarray(int[] arr) {
        long max=Long.MIN_VALUE;
        long cur=1;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                cur=cur*arr[j];
                if(cur>max)
                    max=cur;
            }
            cur=1;

        }
        System.out.println(max);
        return max;
    }
}
