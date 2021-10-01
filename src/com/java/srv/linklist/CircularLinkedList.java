package com.java.srv.linklist;

public class CircularLinkedList {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node last= null;

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next= head;

        last=fourth;

        display(head,last);

    }

    private static void display(Node head, Node last) {
        Node current=head;
        while (current!=last){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.print(current.data);
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
