package com.java.srv.fourFifty;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = {2,6,1,9,4,5,3};

        consecutiveSubSequence(arr);
    }

    private static int consecutiveSubSequence(int[] arr) {
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < hs.size(); i++) {

            int countStr;
            if (hs.contains(arr[i] - 1)) {
                continue;
            } else {
                int val=arr[i];
                while (hs.contains(val)) {
                    count++;
                    val++;

                }
                countStr=count;
                count=0;
                if (max<countStr){
                    max=countStr;
                }
            }
        }
        System.out.println(max);
        return max;
    }
}
