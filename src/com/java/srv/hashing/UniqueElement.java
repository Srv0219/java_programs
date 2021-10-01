package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = { 10, 34, 5, 10, 3, 5, 10 };
        uniqueArrayElement(arr);
    }

    private static void uniqueArrayElement(int[] arr) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if(hs.get(arr[i])==null){
                hs.put(arr[i],1 );
            } else {
                int count = hs.get(arr[i]);
                hs.put(arr[i],count+1 );
            }
        }
        for (Map.Entry<Integer,Integer> set:hs.entrySet()){
            System.out.println(set.getKey());
        }
    }
}
