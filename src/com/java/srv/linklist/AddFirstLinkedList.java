package com.java.srv.linklist;

import java.util.Stack;

public class AddFirstLinkedList {
    public static void main(String[] args) {
        int val=6;
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node fifth = new Node(60);
        Node sixth = new Node(70);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        display(head);
        addFirst(head,val);
        //System.out.println(ref.data);
       // display(head);

    }

    private static void addFirst(Node head, int val) {
        Node current = head;
        Node addFirst = new Node(val);
        addFirst.next=current;
       current=addFirst;

        display(current);

    }

    private static void display(Node head) {
        Node current = head;
        Stack<Integer> st = new Stack<>();
        while (current!=null){

            System.out.print(current.data+ " ");
            current=current.next;
        }
        System.out.println(" ");
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
