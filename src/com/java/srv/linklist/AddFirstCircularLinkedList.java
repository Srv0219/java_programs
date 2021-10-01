package com.java.srv.linklist;

public class AddFirstCircularLinkedList {
    public static void main(String[] args) {
        int val=5;

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
        addFirst(head,last,val);
        addFirst(head,last,7);
    }

    private static void addFirst(Node head, Node last, int val) {
        Node addNew = new Node(val);

        if (last==null){
            last=addNew;
        }
        else {
            addNew.next=last.next;
        }
        last.next=addNew;
        display(addNew,last);
    }

    private static void display(Node head, Node last) {
        Node current = head;
        while (current!=last){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print(current.data);
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
