package com.java.srv.linklist;

public class LastElementFrontLinkedList {
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

        diplay(head);
        lastElementFirst(head);

    }

    private static void lastElementFirst(Node head) {
        Node current=head;
        Node secondLast=null;
        while (current.next!=null){
            secondLast=current;
            current=current.next;
        }
        secondLast.next=null;
        current.next=head;
        diplay(current);

    }

    private static void diplay(Node head) {
        Node current=head;
        while (current!=null){
            System.out.print(current.data +" - ");
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
