package com.java.srv.linklist;

public class FindNthValueLastLinkedList {
    public static void main(String[] args) {
        int val=3;
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

        display(head,val);

    }

    private static void display(Node head, int val) {
        int size=0;
        Node dupli=head;
        while (dupli!=null){
            System.out.print(dupli.data+ " - ");
            size++;
            dupli=dupli.next;
        }
        System.out.println(" ");
        findLastNthValue(head,val,size);

    }

    private static void findLastNthValue(Node head,  int val,int size) {
        Node contain =head;
        int str=size-val;
        for (int i=0;i<str;i++){
           contain=contain.next;
        }
        System.out.println(contain.data);

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
