package com.java.srv.hashing;

import java.util.HashMap;

public class LongestSubArrayZero {
    public static void main(String[] args) {
        int[] arr ={15, -2, 2, -8, 1, 7, 10, 23};

        subArrayZero(arr);
    }

    private static void subArrayZero(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max=Integer.MIN_VALUE;

        int add =0;
        for (int i=0;i<arr.length;i++){
            hm.put(0,1);
            add=add+arr[i];
            if (hm.get(add)==null){
                hm.put(add,1);
            }
            else {
               if (i-hm.get(add)>max){
                   max=i-hm.get(add);
               }
            }
        }
        System.out.println(max);
    }
}
