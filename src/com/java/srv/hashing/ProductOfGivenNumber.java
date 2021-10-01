package com.java.srv.hashing;

import java.util.HashSet;

public class ProductOfGivenNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 9, 40};
        productNumber(arr);
    }

    private static void productNumber(int[] arr) {
        int num=120;
        int j=0;
        HashSet<Integer> hm = new HashSet<>();
        for (int i=0;i< arr.length;i++){
            if (hm.contains(num/ arr[i])){
                System.out.println(arr[i]+" " +num/arr[i]);
            }
            hm.add(arr[i]);

        }



    }
}
