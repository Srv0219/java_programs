package com.java.srv.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class SinglyLinkedListPalindrome{
    public static void main(String[] args) {

        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(30);
        Node fifth = new Node(20);
        Node sixth = new Node(10);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        System.out.println(display(head));
        // addFirst(head, val);
        //System.out.println(ref.data);
        // display(head);

    }

   /* private static void addFirst(Node head, int val) {
        Node current = head;
        Node addFirst = new Node(val);
        addFirst.next = current;
        current = addFirst;
        display(current);

    }*/

    private static Boolean display(Node head) {
        Node current = head;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        while (current != null) {
            st.push(current.data);
            al.add(current.data);
            current = current.next;
        }
        System.out.println(st);
        System.out.println(al);

        if (al.equals(st)) {
            return true;
        }
        return false;

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
