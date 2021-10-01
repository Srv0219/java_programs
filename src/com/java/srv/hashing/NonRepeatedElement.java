package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,4,6,7,7,8,9,4};

        nonRepeat(arr);
    }

    private static void nonRepeat(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (hm.get(arr[i])==null){
                hm.put(arr[i],1 );

            }else{
                int str =hm.get(arr[i]);
                hm.put(arr[i],str+1);
            }
        }
        for (Map.Entry<Integer,Integer> set : hm.entrySet()){

            if (set.getValue()==1){
                System.out.println(set.getKey());
            }

        }
    }
}
