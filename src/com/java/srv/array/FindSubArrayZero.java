package com.java.srv.array;

import java.util.HashMap;
import java.util.Map;

public class FindSubArrayZero {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 28};

        System.out.println( subArrayZero(arr));
    }

    private static boolean subArrayZero(int[] arr) {
        int str = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
            if (hm.get(str) == null) {
                hm.put(str, i);
                // System.out.println(hm);
            } else {
                // hm.put(str, hm.get(arr[i]+1) );
                method(arr, hm.get(str) + 1, i);
                return true;
            }

        }
        /*System.out.println(hm);
        for (Map.Entry<Integer,Integer>set: hm.entrySet()){
            if (set.getValue()>2){
                return true;
            }
        }*/
        return false;
    }


    private static void method( int [] arr ,int initail, int finalVla) {
        for(int i =initail; i<=finalVla ; i++){
            System.out.println(arr[i]);
        }
    }

}
