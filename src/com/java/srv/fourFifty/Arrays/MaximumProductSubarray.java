package com.java.srv.fourFifty.Arrays;

import java.util.ArrayList;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {8, -2, -2, 0, 8, 0, -6, -8, -6, -1};
        maxProductSubarray(arr);
    }

    private static long maxProductSubarray(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        long mulstr;
        long mul = 1;
        long str = 0;
        for (int i = 0; i < arr.length; i++) {
            mul = mul * arr[i];
            mulstr = mul;
            if (str < Math.abs(mulstr)) {
                str = mul;
            } else if (mul==0) {
                mul=1;
            }

        }
        System.out.println(str);
        return str;
    }
}
