package com.java.srv.hashing;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(12);
        p.add(11);
        p.add(12);
        p.add(13);
        p.add(9);

        Iterator<Integer> it = p.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        //    System.out.println(p.poll());
        }

    }
}
