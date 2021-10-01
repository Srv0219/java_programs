package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void main(String[] args) {
         String[]arr = { "saueav", "adak" , "saurab" , "saurav","adak" , "saurab" , "saurav" };
         stringCount(arr);
    }

    private static void stringCount(String[] arr) {
        HashMap<String,Integer> hs = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (hs.get(arr[i])==null){
                hs.put(arr[i],1 );
            }
            else {
                int count =hs.get(arr[i]);
                hs.put(arr[i],count+1 );
            }
        }

        for (Map.Entry<String, Integer> set : hs.entrySet()) {
            System.out.println(set.getKey() + " - " + set.getValue());
        }
    }
}
