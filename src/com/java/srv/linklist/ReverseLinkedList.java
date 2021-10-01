package com.java.srv.linklist;

public class ReverseLinkedList {
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
        reverse(head);

    }

    private static Node reverse(Node head) {
        Node current=head;
        Node prev=null;
        Node next=null;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        display(prev);
 return prev;

    }

    private static void display(Node head) {
        Node current=head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
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
