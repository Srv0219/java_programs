package com.java.srv.array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        subArraySumZero(arr);
    }

    private static void subArraySumZero(int[] arr) {
        /*HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;

        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            hm.put(0, 1);
            add = add + arr[i];
            if (hm.get(add) == null) {
                hm.put(add, 1);
            } else {
                if (i - hm.get(add) > max) {
                    max = i - hm.get(add);
                }
            }
        }
        System.out.println(max);*/
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        hm.put(0, 1);
        int add = 0;
        for (int i = 0; i < arr.length; i++) {

            add = add + arr[i];
            if (hm.get(add) == null) {
                hm.put(add, 1);
               //int end = hm.get(i)
            } else {
               printValue(hm.get(add),i,arr);
            }
        }
      /*  System.out.println(max);

        for (Map.Entry<Integer,Integer> set : hm.entrySet()){
            System.out.println(set.getKey()+ " " + set.getValue());
        }*/

    }

    private static void printValue(int min, int max,int[] arr)
    {
     for (int j =min;j<max;j++){
         System.out.println(arr[j]);
     }
    }

}
