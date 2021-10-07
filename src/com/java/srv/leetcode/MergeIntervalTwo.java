package com.java.srv.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervalTwo {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 4},
                {0, 4},
                {8, 10},
                {15, 18}};
        mergeTime(arr);

    }

    private static int[][] mergeTime(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(final int[] entry1,
                               final int[] entry2) {
                if (entry1[arr[0].length - 1] > entry2[arr[0].length - 1])
                    return 1;
                else
                    return -1;
            }
        });

      //  Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        int i=0,j=1;

        while(i<arr.length && j<arr.length) {
            if(arr[i][1] >= arr[j][0]) {
                arr[i][1] = Math.max(arr[i][1],arr[j][1]);
                j++;
            } else {
                i++;
                arr[i][0] = arr[j][0];
                arr[i][1] = arr[j][1];
                j++;
            }
        }
        return Arrays.copyOfRange(arr, 0, i+1);
    }
}
