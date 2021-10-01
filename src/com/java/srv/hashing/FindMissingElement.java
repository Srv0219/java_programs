package com.java.srv.hashing;

import java.util.HashMap;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr ={1, 14, 11, 51, 15};
        missingElement(arr);
    }

    private static void missingElement(int[] arr) {
        int first =50;
        int end=55;
        HashMap<Integer,Integer> hm =new HashMap<>();
        for (int i=0;i< arr.length;i++){
            hm.put(i,arr[i]);
        }

        for (int i=first;i<end;i++){
            if (hm.containsValue(i)){
                continue;
            }
            else {
                System.out.println(i);
            }
        }

    }
}
