package com.java.srv.linklist;

public class InsertValueIndexLinkedList {
    public static void main(String[] args) {
        int indx = 3;
        int val = 35;
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
        Node ref = insert(head, indx, val);
        display(head);


    }

    private static void display(Node head) {
        Node duplicate = head;
        while (duplicate != null) {
            System.out.print(duplicate.data + " - ");
            duplicate = duplicate.next;
        }
        System.out.println();
    }

    private static Node insert(Node head, int indx, int val) {
        Node current = head;
        int i = 0;
        Node newNode = new Node(44);
        while (i < indx) {
            current = current.next;
            i++;
        }
        newNode.next = current.next;
        current.next = newNode;

        return current;
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
