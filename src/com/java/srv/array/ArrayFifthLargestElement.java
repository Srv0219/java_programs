package com.java.srv.array;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class ArrayFifthLargestElement {

    public static void main(String[] args) {
        int arr[] = {2, 24, 6, 3, 123, 45, 65, 23, 34, 4, 7, 8, 1, 23, 86, 45, 75, 29, 266, 678};

        fifthLargestElement(arr);

    }

    private static void fifthLargestElement(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            al.add(pq.poll());

        }
        System.out.print(al+" ");
        System.out.println(" ");
        for (int i = al.size(); i > 0; i--) {
            if (i == al.size() - 5) {
                System.out.println("Fifth largest : "+al.get(i));
            }

        }

    }
}
