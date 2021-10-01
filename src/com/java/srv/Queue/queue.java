package com.java.srv.Queue;


// Java Program Demonstrate offer()
// method of Queue

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class queue {
    public static void main(String[] args) throws IllegalStateException {

        // create object of Queue
        Queue<Integer> Q = new LinkedBlockingQueue<Integer>();

        if (Q.offer(10))
            System.out.println("The Queue is not full"
                    + " and 10 is inserted");
        else
            System.out.println("The Queue is full");

        if (Q.offer(15))
            System.out.println("The Queue is not full"
                    + " and 15 is inserted");
        else
            System.out.println("The Queue is full");

        if (Q.offer(25))
            System.out.println("The Queue is not full"
                    + " and 25 is inserted");
        else
            System.out.println("The Queue is full");

        if (Q.offer(20))
            System.out.println("The Queue is not full"
                    + " and 20 is inserted");
        else
            System.out.println("The Queue is full");

        // before removing print Queue
        System.out.println("Queue: " + Q);
    }
}
