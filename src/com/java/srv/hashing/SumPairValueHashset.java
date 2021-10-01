package com.java.srv.hashing;

import java.util.HashSet;

public class SumPairValueHashset {
    public static void main(String[] args) {
        int[] arr ={2,3,1,4,6,5};
        int val=5;
        sumHashset(arr,val);
    }

    private static void sumHashset(int[] arr, int val) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (hs.contains(val-arr[i])){
                System.out.println(val-arr[i]+" "+arr[i]);
            }
            hs.add(arr[i]);
        }
    }
}
