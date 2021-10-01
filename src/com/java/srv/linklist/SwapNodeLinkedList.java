package com.java.srv.linklist;

import java.util.HashMap;

public class SwapNodeLinkedList {
    public static void main(String[] args) {
        int val1 = 12;
        int val2 = 20;

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


        diplay(head);
        swapNumbers(head,val1,val2);

    }

    private static void swapNumbers(Node head, int val1, int val2) {
        Node current=head;
        Node one =null;
        Node two= null;


        while (current!=null){
            if (current.data==val1){
                one=current;

            }
            else if(current.data==val2){
                two=current;

            }
          //  System.out.println(current);
            current=current.next;
        }
       /* System.out.println(" ---------------------------------- ");
        System.out.println(one.data+" - "+one+" -  "+one.next);
        System.out.println(two.data+" - "+two+" -  "+two.next);
        System.out.println(" ---------------------------------- ");*/
              current=head;
        while (current.next!=null){
            if (current==one){
                two.next=current.next;
                current=two;

            }

            else if (current==two){
                one=current.next;
                current=one;

            }
            System.out.println(current.data +" "+current+" "+current.next.data);
            current=current.next;
        }
        diplay(current);

    }

    private static void diplay(Node head) {
        Node current=head;
        while (current!=null){
            System.out.print(current.data +" - ");
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
