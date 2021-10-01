package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = { 10, 34, 5, 10, 3, 5, 10 };
        maxNumber(arr);
    }

    private static void maxNumber(int[] arr) {
        int max=Integer.MIN_VALUE;
        int key=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (hs.get(arr[i])==null){
                hs.put(arr[i],1 );
            } else {
                int count=hs.get(arr[i]);
                hs.put(arr[i],count+1);
            }

        }
        for (Map.Entry<Integer,Integer> set : hs.entrySet()){
            //maximum key value
//            if (set.getKey()>max){
//                max=set.getKey();
//                System.out.println( max);
//            }
            //maximum count value
            if (set.getValue()>max){
                max=set.getValue();
                key = set.getKey();
            }

        }
        System.out.println( max+" - "+key);
    }
}
