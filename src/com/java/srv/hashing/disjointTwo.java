package com.java.srv.hashing;

import java.util.HashSet;

public class disjointTwo {
    public static void main(String[] args) {
        int[] set1 = {12, 34, 11, 9 , 3};
        int[] set2 = {2, 1, 1, 5};
     boolean val = disjointVal(set1,set2);
        System.out.println(val);
    }

    private static boolean disjointVal(int[] set1, int[] set2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<set1.length;i++){
            hs.add(set1[i]);

        }
        for (int i=0;i<set2.length;i++){
            if (hs.contains(set2[i])) {
               return true;
            }

        }
        return false;
       // System.out.println(hs);
    }
}
