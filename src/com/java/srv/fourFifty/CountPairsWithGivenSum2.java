package com.java.srv.fourFifty;

import java.util.Arrays;
import java.util.HashMap;

public class CountPairsWithGivenSum2 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        int K = 6;
        getPairsCount(arr, K);
    }

    public static int getPairsCount(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (hm.get(arr[i])==null){
                hm.put(arr[i], 1);
            }else{
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }
        int twice_count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (hm.get(k - arr[i]) != null) {

                twice_count += hm.get(k - arr[i]);

                System.out.println(hm.get(k - arr[i])+" "+twice_count);
            }
            if (k - arr[i] == arr[i]) {
                twice_count--;
            }
        }
        System.out.println(twice_count/2);
        return twice_count / 2;
    }
}
