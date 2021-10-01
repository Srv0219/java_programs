package com.java.srv.linklist;

public class FindNthValueLinkedList {
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

        findNthValue(head,val);

    }

    private static void findNthValue(Node head, int val) {
        Node contain=head;
        while (contain!=null){
            System.out.print(contain.data+" - ");
            contain=contain.next;

        }
        System.out.println(" ");
       findValue(head,val);
    }

    private static void findValue(Node head, int val) {
        Node contain=head;

            for (int i = 1; i <= val; i++) {
                if (val == i) {
                    System.out.println(contain.data);
                    break;
                }
                contain = contain.next;

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
