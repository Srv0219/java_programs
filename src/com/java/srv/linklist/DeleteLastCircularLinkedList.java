package com.java.srv.linklist;

public class DeleteLastCircularLinkedList {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node last = null;

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head;

        last = fourth;
        display(head, last);


    }

    private static void deleteNode(Node head, Node last, int size) {
        Node current = head;
        if (last == null) {
            return;
        } else {
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }

            current.next = last.next;
            last = current;

        }
        current = last.next;
        while (current != last) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data);
        System.out.println(" ");

    }

    private static void display(Node head, Node last) {
        int size = 0;
        Node current = head;
        while (current != last) {
            System.out.print(current.data + " ");
            current = current.next;
            size++;
        }
        System.out.print(current.data);
        System.out.println(" ");

        deleteNode(head, last, size);
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
