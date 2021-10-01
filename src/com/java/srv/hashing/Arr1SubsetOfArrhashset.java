package com.java.srv.hashing;

import java.util.HashSet;

public class Arr1SubsetOfArrhashset {
    public static void main(String[] args) {
        int[] arr2 ={-2,4,6,-3,7,4,0,-8};
        int[] arr1 ={-2,4,6,-3,7,4,0};
        boolean ans=subSetHashSet(arr1,arr2);
        System.out.println(ans);
    }

    private static boolean subSetHashSet(int[] arr1, int[] arr2) {
        boolean[] a =new boolean[arr2.length];
        HashSet<Integer> hs =new HashSet<>();
        for (int i=0;i< arr1.length;i++){
            hs.add(arr1[i]);
        }
        for (int i=0;i< arr1.length;i++){
            if(!hs.contains(arr2[i])){
                return false;
            }

        }
        return true;
    }
}
