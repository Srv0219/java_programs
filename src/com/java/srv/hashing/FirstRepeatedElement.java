package com.java.srv.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        int[] arr ={1,2,-4,1,2,-6,7,-2,-4};
        repeatedElement(arr);
    }

    private static void repeatedElement(int[] arr) {
        LinkedHashMap<Integer,Integer> lhm =new LinkedHashMap<>();
        for (int i=0;i< arr.length;i++){
            if (lhm.get(arr[i])==null){
                lhm.put(arr[i],1 );
            }
            else {
                lhm.put(arr[i], lhm.get(arr[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer> set: lhm.entrySet()){

            if (set.getValue()>1){
                System.out.println(set.getKey());
                break;
            }
        }
    }
}
