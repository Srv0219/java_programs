package com.java.srv.hashing;

import java.util.HashMap;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;

        longestSubArray(arr, k);
    }

    private static void longestSubArray(int[] arr, int k) {
        int sum = 0;
        int rem = 0;
        int max=Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            rem = sum % k;
            if(hm.get(rem)== null){
                hm.put(rem,1);
            }
            else {

                if ((i-hm.get(rem))>max ){
                    max = i-hm.get(rem);
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println(max);
    }
}
