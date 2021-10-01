package com.java.srv.linklist;

public class RotateLinkedList {
    public static void main(String[] args) {
        int ind=4;

        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node fifth = new Node(60);


        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        display(head);
        rotateList(head,ind);
      //  display(head);
    }

    private static void rotateList(Node head, int ind) {
        int count=1;
        Node current = head;
      //  Node reserv =null;
      //  Node next=null;
        while (current.next!=null){
              // count++;
            current=current.next;
        }

         current.next = head;
      //  head=current;

        for (int i=0;i<ind-1;i++){
            current=current.next;
        }

        head = current.next;
        current.next=null;

        display(head);
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
