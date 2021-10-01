package com.java.srv.linklist;

import java.util.HashSet;

public class IntersectLinkedList {
    public static void main(String[] args) {

        Node head1 = new Node(3);
        Node first1 = new Node(6);
        Node second1 = new Node(9);
        Node third1 = new Node(15);
        Node fourth1 = new Node(30);

        head1.next = first1;
        first1.next = second1;
        second1.next = third1;
        third1.next = fourth1;


        Node head2 = new Node(10);
        Node first2 = new Node(15);
        Node second2 = new Node(30);

        head2.next=first2;
        first2.next=second2;
        diplay(head1,head2);

    }

    private static void diplay(Node head1, Node head2) {
        HashSet<Integer> hs = new HashSet<>();
        Node current1=head1;
        Node current2=head2;
        while (current1!=null){
            hs.add(current1.data);
            current1=current1.next;
        }
        while (current2!=null){
            if (hs.contains(current2.data)){
                System.out.println(current2.data);
            }
            current2=current2.next;
        }
        System.out.println(hs);
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
