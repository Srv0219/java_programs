package com.java.srv.linklist;

import java.util.HashSet;

public class DetectLoopLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);


        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        //display(head);
        detectLoop(head);

    }

    private static void detectLoop(Node head) {
        Node current=head;
        HashSet<Node> hs = new HashSet<>();
        while (current!=null){
            if (hs.contains(current)){
                System.out.println(" Loop found");
                break;
            }
            hs.add(current);
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

/*
    private static void display(Node head) {
        Node current=head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println(" ");
    }*/

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
