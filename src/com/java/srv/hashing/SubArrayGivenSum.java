package com.java.srv.hashing;

import java.util.HashMap;

public class SubArrayGivenSum {
    public static void main(String[] args) {
       int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        subArray(arr,sum);
    }

    private static void subArray(int[] arr, int sum) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int val=0;
        for (int i=0;i< arr.length;i++){
            val=val+arr[i];
            if (val<0){

            }
            if (hm.get(arr[i])==null){
                hm.put(val,i+1);
            }
           else {
               if (val==0){
                   printArray(0,i,arr);
               }
               else {
                   printArray(hm.get(arr[i]), i,arr);
               }
            }
        }
    }
    public static void printArray(int start, int end, int[] arr){
        for (int i=start;i<end;i++){
            System.out.println(arr[i]);
        }
    }
}
