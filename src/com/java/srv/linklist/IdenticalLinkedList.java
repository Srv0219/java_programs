package com.java.srv.linklist;

public class IdenticalLinkedList {
    public static void main(String[] args) {

        Node head1 = new Node(1);
        Node first1 = new Node(2);
        Node second1 = new Node(3);

        head1.next = first1;
        first1.next = second1;

        Node head2 = new Node(1);
        Node first2 = new Node(2);
        Node second2 = new Node(4);

        head2.next = first2;
        first2.next = second2;

        display(head1,head2);

    }

    private static void display(Node head1, Node head2) {
        Node current1= head1;
        Node current2= head2;
        int size=0;
        int check=0;

        while (current1!=null && current2!=null){

            if (current1.data == current2.data){
                check++;
            }
            size++;
            System.out.print(current1.data+" ");
            current1=current1.next;
            current2=current2.next;
        }
        if (size==check){
            System.out.println("identical linkedlist ");
        }
        else {
            System.out.println("Not identical linkedlist ");
        }

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
