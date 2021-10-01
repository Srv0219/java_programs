package com.java.srv.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class CountSubsetEvenDistinctNo {
    public static void main(String[] args) {
       // int arr[] = {10, 3, 4, 2, 4, 20, 10, 6, 8, 14, 2, 6, 9};
        int[] arr = {4, 2, 1, 9, 2, 6, 5, 3};
        subsetEvenDistinct(arr);

    }

    private static void subsetEvenDistinct(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                hs.add(arr[i]);
            }
        }
        System.out.println(hs);
        int[] ar = new int[hs.size()];
        Iterator<Integer> iterator = hs.iterator();
        int l = 0 ;
        while (iterator.hasNext()){
             ar[l] = iterator.next();
             l++;
        }

        int str = 1;
        int pow = 2;
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            for(int j = i ; j<n ; j++){
                for (int k=i;k<=j;k++){
                    System.out.print(ar[k] + " ");
                }
                System.out.println();
            }
           // str = str * pow;
        }
       // System.out.println(str - 1);
    }

}
