package com.java.srv.hashing;

import java.util.HashMap;

public class DuplicateElementkth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int val =3;
        duplicateElement(arr,val);
    }

    private static void duplicateElement(int[] arr, int val) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(hm.get(arr[i])== null){
                hm.put(arr[i],i);
            }
            else {
                int dis =i-hm.get(arr[i]);
                System.out.println(dis <= val);

            }
        }
    }
}
