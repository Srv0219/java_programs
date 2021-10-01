package com.java.srv.linklist;

public class AddLastLinkedList {
    public static void main(String[] args) {
        int val = 80;
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
        Node s = addLast(head, val);
        display(head);


    }

    private static Node addLast(Node head, int val) {
        Node current = head;
        Node newNode = new Node(val);
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        // current.next=newNode;
        // newNode.next=null;

        //

        return current;
    }

    private static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ");
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
