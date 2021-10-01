package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;

public class duplicateHashMap {
    public static void main(String[] args) {

        int[] arr ={1,2,3,1,2,3,1,2,3,4};

        System.out.println("Start time" + System.currentTimeMillis());
        duplicateElement(arr);
        System.out.println("End time" + System.currentTimeMillis());
    }

    private static void duplicateElement(int[] arr) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (hs.get(arr[i])==null){
                hs.put(arr[i],1);
            }
            else {
                int count =hs.get(arr[i]);
                hs.put(arr[i],count+1);
            }
        }
//        System.out.println(hs);

  //      System.out.println(hs.entrySet());
    //    System.out.println(hs.keySet());
      //  System.out.println(hs.values());

        for(Map.Entry<Integer , Integer> set: hs.entrySet()){

            if(set.getValue()>1){
                System.out.println(set.getKey()+ ":" + set.getValue());
            }

        }

    }
}
