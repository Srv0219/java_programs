package com.java.srv.fourFifty.Arrays;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        sortedArray(A, B, C);
    }

    private static ArrayList<Integer> sortedArray(int[] a, int[] b, int[] c) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        if (a.length == 0 && b.length == 0 && c.length == 0) {
            al.add(-1);
            return al;
        }


        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                if (hm.get(a[i]) == null) {
                    hm.put(a[i], 1);
                } else {
                    hm.put(a[i], hm.get(a[i]) + 1);
                }
            }
        }
        for (int j = 0; j < b.length; j++) {
            if (b[j] > 0) {
                if (hm.get(b[j]) == null) {
                    hm.put(b[j], 1);
                } else {
                    hm.put(b[j], hm.get(b[j]) + 1);
                }
            }
        }
        for (int k = 0; k < c.length; k++) {
            if (c[k] > 0) {
                if (hm.get(c[k]) == null) {
                    hm.put(c[k], 1);
                } else {
                    hm.put(c[k], hm.get(c[k]) + 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> set : hm.entrySet()) {
            if (set.getValue() > 1) {
                al.add(set.getKey());
            }
        }
        Collections.sort(al);
        return al;
    }
}
