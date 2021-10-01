package com.java.srv.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 4, 4, 3, 5};

        frequencySort(arr);
    }

    private static void frequencySort(int[] arr) {
        PriorityQueue<Map<Integer,Integer>> pq =new PriorityQueue<>();
        Map<Integer , Integer> hm = new HashMap<>();
        for(int i : arr){
           hm.put(arr[i] , hm.getOrDefault(arr[i] ,0)+1);
        }


        System.out.println(hm);
       PriorityQueue<Integer> pq1 =new PriorityQueue((n1,n2) -> hm.get(n2) - hm.get(n1));
       for(int i : hm.keySet()){
           pq1.add(i);
       }

       while (pq1.isEmpty()==false){
           System.out.println(pq1.poll());
       }
    }
}
