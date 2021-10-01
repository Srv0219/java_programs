package com.java.srv.linklist;

public class FindLengthLinkedList {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        first.next=second;
        second.next=third;
        third.next=forth;
        forth.next= fifth;

        length(first);



    }

    private static void length(Node first) {
        int size = 0;
        Node dup = first;
        while (dup!=null){
            size++;
            dup=dup.next;
        }
        System.out.println(size);
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
