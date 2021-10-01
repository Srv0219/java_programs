package com.java.srv.linklist;

import java.util.Stack;

public class ReverseStackLinledList {
    public static void main(String[] args) {
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

    }

    private static void display(Node head) {
        Stack<Integer> stack= new Stack<>();
        Node current=head;
        while (current.next!=null){
            stack.push(current.data);
            current=current.next;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
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
