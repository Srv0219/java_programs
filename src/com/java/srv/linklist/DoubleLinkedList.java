package com.java.srv.linklist;

public class DoubleLinkedList {

        Node head;
        Node tail;


      public static class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }


          public static void main(String[] args) {
            Node head = new Node(10);
              Node first = new Node(20);
              Node second = new Node(30);
              Node third = new Node(40);
              Node tail = new Node(50);

              head.next=first;
              first.next=second;
              second.next=third;
              third.next=tail;

              tail.previous=third;
              third.previous=second;
              second.previous=first;
              first.previous=head;

              displayForward(head);
              displeyBackward(tail);


          }
          private static void displayForward(Node head) {
            Node current=head;
            while (current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
              System.out.println();
          }

          private static void displeyBackward(Node tail) {
              Node current=tail;
              while (current!=null){
                  System.out.print(current.data+" ");
                  current=current.previous;
              }
              System.out.println();

          }


      }
}
