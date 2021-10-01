package com.java.srv.linklist;

public class DisplayInsertionLinkedList {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        Node head = null;
        Node tail = null;


        /*for (int i = 0; i < arr.length; i++) {
            Node new_node = new Node(arr[i]);
            if (head == null) {
                head = tail = new_node;

            } else {
                tail.next = new_node;
                tail = new_node;
            }
        }*/
        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            newNode.next=head;
            head=newNode;

        }


        display(head);
    }

    private static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
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
