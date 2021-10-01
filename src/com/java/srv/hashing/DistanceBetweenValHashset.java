package com.java.srv.hashing;

import java.util.HashMap;

public class DistanceBetweenValHashset {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,1,2};
        distanceBetween(arr);
    }

    private static void distanceBetween(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (hm.get(arr[i])==null){
                hm.put(arr[i],i);
            }
            else {
               int dis =i-hm.get(arr[i])-1;
                System.out.println(arr[i]+" "+dis);
            }
        }
    }
}
