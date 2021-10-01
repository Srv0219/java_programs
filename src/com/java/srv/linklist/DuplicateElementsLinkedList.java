package com.java.srv.linklist;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(20);
        Node fourth = new Node(10);
        Node fifth = new Node(40);
        Node sixth = new Node(50);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        display(head);

    }


    private static void display(Node head) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        Node contain = head;
        while (contain != null) {
            System.out.print(contain.data + " -> ");

            if (hs.get(contain.data) == null) {
                hs.put(contain.data, 1);
            } else {
                int count = hs.get(contain.data);
                hs.put(contain.data, count + 1);
            }
            contain = contain.next;
        }
        System.out.println(" ");
        duplicate(hs);

    }

    private static void duplicate(HashMap<Integer, Integer> hs) {
        for (Map.Entry<Integer, Integer> set : hs.entrySet()) {
            if (set.getValue() > 1) {
                System.out.print(set.getKey() + " ");
            }
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
