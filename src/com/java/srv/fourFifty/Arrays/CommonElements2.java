package com.java.srv.fourFifty.Arrays;

import java.util.*;

public class CommonElements2 {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        sortedArray(A, B, C);
    }

    private static ArrayList<Integer> sortedArray(int[] a, int[] b, int[] c) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs1 = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        if (a.length == 0 && b.length == 0 && c.length == 0) {
            al.add(-1);
            return al;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                hs1.add(a[i]);
            }
        }


        for (int j = 0; j < b.length; j++) {
            if (hs1.contains(b[j])) {
                hm.put(b[j], 0);
            }
        }
        for (int k = 0; k < c.length; k++) {
            if (hs1.contains(c[k])) {
                hm.put(c[k], 0);

            }
        }
        for (Map.Entry<Integer, Integer> set : hm.entrySet()) {
            al.add(set.getKey());
        }

        Collections.sort(al);
        return al;
    }
}
