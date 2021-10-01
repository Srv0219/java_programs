package com.java.srv.linklist;

public class CreateCircularLinkedList {


    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=head;

        Node tail=fourth;

        display(head,tail);
        insertFirst(head,tail);


    }

    private static void insertFirst(Node head, Node tail) {
        Node newNode = new Node(5);

        newNode.next=head;
        head=newNode;
        tail.next=head;

        display(head,tail);

    }

    private static void display(Node head, Node tail) {
        Node current = head;
        while (current!=tail){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println(current.data);

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
