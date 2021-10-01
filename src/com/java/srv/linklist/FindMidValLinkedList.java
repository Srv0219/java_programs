package com.java.srv.linklist;

public class FindMidValLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node fifth = new Node(60);
        Node sixth = new Node(70);
       // Node seventh = new Node(80);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
     //   sixth.next=seventh;

        findMidVal(head);

    }

    private static void findMidVal(Node head) {
        Node duplicate = head;
        int size=0;

        while (duplicate!=null){
            size++;
            duplicate=duplicate.next;
        }
        find(size,head);
    }

    private static void find(int size,Node head) {
        int val=size/2;
        Node dup=head;
        for (int i=0;i<val;i++){
            dup=dup.next;
        }
        System.out.println(dup.data);
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
