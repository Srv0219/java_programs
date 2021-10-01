package com.java.srv.linklist;

public class DeleteNodeLinkedList {
    public static void main(String[] args) {
        int ind=2;
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
        delete(head,ind);

    }
    private static void diplay(Node head) {
        Node current=head;
        while (current!=null){
            System.out.print(current.data +" - ");
            current=current.next;
        }
        System.out.println(" ");
    }

    private static void delete(Node head, int ind) {
        Node current=head;
        int i=0;
        while (current!=null){
            if (i==ind){
                current.next=current.next.next;
                break;
            }
            i++;
            current=current.next;
        }
        diplay(head);
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
