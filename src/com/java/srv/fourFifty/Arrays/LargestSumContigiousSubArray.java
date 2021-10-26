package com.java.srv.fourFifty.Arrays;

import java.util.ArrayList;

public class LargestSumContigiousSubArray {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};

        contigiousSubArray(arr);
    }

    private static int contigiousSubArray(int[] arr) {
        int csum = arr[0];
        int osum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (csum >= 0) {
                csum = csum + arr[i];
            } else {
                csum = arr[i];
            }
            if (csum > osum) {
                osum = csum;
            }
        }
        System.out.println(osum);
        return osum;
    }
}
