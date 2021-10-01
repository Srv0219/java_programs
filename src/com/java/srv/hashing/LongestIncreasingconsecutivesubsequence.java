package com.java.srv.hashing;

import java.util.HashMap;

public class LongestIncreasingconsecutivesubsequence {
    public static void main(String[] args) {
        int[] arr = {3, 10, 3, 11, 4, 5, 6, 7, 8, 12};
        increasingSubsequence(arr);

    }

    private static void increasingSubsequence(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (hm.containsKey(arr[i]-1)){
                hm.put(arr[i], hm.get(arr[i]-1)+1);
                hm.remove(arr[i]-1);
            }
            else {
                hm.put(arr[i],1 );
            }
        }
        System.out.println(hm);
    }
}
