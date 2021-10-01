package com.java.srv.linklist;

public class NewLinkedList {
    Node head;

    public static void main(String[] args) {
        NewLinkedList list = new NewLinkedList();
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = forth;

        disp(head);

    }

    private static void disp(Node head) {
        Node duplicate = head;
        while (duplicate.next != null) {
            System.out.print(duplicate.data + "--->");
            duplicate = duplicate.next;
        }
        System.out.println(duplicate.data);
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
