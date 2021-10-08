package com.java.srv.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

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

        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] arr1:arr){

            if(merged.isEmpty() || merged.getLast()[1]<arr1[0]){
                merged.add(arr1);
            }else{
                merged.getLast()[1]=Math.max(merged.getLast()[1],arr1[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
