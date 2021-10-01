package com.java.srv.hashing;

import java.util.HashMap;

public class SymmetricValue {
    public static void main(String[] args) {
        int[][] arr ={{11,20},
                     {30,40},
                     {5,10},
                     {40,30},
                {10,5}};
        symmetricValue(arr);
    }

    private static void symmetricValue(int[][] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i< arr.length;i++){

            int key = arr[i][0];
            int val = arr[i][1];

            if (hm.get(val)==null){
                hm.put(key,val);
            }else if(hm.get(val)==key) {
                System.out.println(key+" "+val);
            }
        }
    }
}
