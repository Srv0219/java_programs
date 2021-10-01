package com.java.srv.sorting;

import java.util.PriorityQueue;

public class PriorityQueueSorting {
    public static void main(String[] args) {
        int arr[] = {9, 43, 34, 2, 5, 8, 3, 1, 57};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()){
           // System.out.println(pq.peek());
        System.out.println(pq.poll());
        }
    }
}
