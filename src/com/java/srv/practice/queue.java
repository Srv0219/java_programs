package com.java.srv.practice;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
         queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.contains(0));
        System.out.println(queue.remove());
        System.out.println(queue);


    }
}
