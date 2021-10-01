package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;

public class MaximumDistance {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        maxDistance(arr);
    }

    private static void maxDistance(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == null) {
                hm.put(arr[i], i);
            } else {
                //  int dis =i-hm.get(arr[i])-1;
                int dis = i - hm.get(arr[i]);
                //  System.out.println(arr[i]+" "+dis);
                hm2.put(dis, arr[i]);
            }
        }
        // System.out.println(hm2);
        for (Map.Entry<Integer, Integer> set : hm2.entrySet()) {
            if (set.getKey() > max) {
                max = set.getKey();
            }
        }
        //System.out.println(max);
        for (Map.Entry<Integer, Integer> set : hm2.entrySet()) {
            if (set.getKey() == max) {
                System.out.println(set.getValue() + " - " + set.getKey());
            }

        }
    }
}
