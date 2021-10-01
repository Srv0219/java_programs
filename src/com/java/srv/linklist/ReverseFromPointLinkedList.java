package com.java.srv.linklist;

public class ReverseFromPointLinkedList {
    public static void main(String[] args) {
        int var=12;

        Node head = new Node(10);
        Node first = new Node(15);
        Node second = new Node(12);
        Node third = new Node(13);
        Node fourth = new Node(20);
        Node fifth = new Node(14);


        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        display(head);
        reverse(head,var);
    }

    private static void reverse(Node head, int var) {
        Node current = head;
        Node prev=null;
        Node next=null;
        while (current.next!=null){
            if (current.data==var){
                System.out.println(current.data);
              //  prev.next=current.next;
                next=current.next;
                current.next=prev;
                prev.next=next;

                break;
            }
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

            //current=current.next;
        }
        display(current);
    }

    private static void display(Node head) {
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" ");
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
