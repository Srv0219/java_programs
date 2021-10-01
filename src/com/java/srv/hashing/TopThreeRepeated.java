package com.java.srv.hashing;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopThreeRepeated {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        repeatedArray(arr);
    }

    private static void repeatedArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i=0;i< arr.length;i++){

               hs.put(arr[i], hs.getOrDefault(arr[i],0)+1 );
        }
        System.out.println(hs);

        PriorityQueue<Integer> pq1 =new PriorityQueue((n1,n2) -> hs.get(n2) - hs.get(n1));
        for(int i : hs.keySet()){
            pq1.add(i);
        }


        for (int i=0;i<3;i++)
            System.out.println(pq1.poll());

    }
}
