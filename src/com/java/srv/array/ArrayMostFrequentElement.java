package com.java.srv.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayMostFrequentElement {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 6, 2, 2, 9, 7, 9, 0};

        frequentElement(arr);
    }

    private static void frequentElement(int[] arr) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int key=0;
        for (int i = 0; i < arr.length; i++) {
            if (hs.get(arr[i]) == null) {
                hs.put(arr[i], 1);
            } else {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> set : hs.entrySet()) {
            if (max < set.getValue()) {
                if (set.getValue()>max){
                    max=set.getValue();
                    key = set.getKey();
                }
              //  break;
            }
        }
        System.out.println( key+" "+max);

    }
}
