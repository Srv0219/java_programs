package com.java.srv.hashing;

import java.util.HashSet;

public class DistinctElemet {
    public static void main(String[] args) {

        int[] arr = {1,2,4,2,4,2,4,6,7,8,5,4,3,5,6,7};

        distnct(arr);

    }

    private static void distnct(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i< arr.length;i++){
            hs.add(arr[i]);
        }

        System.out.println(hs);
    }


}
