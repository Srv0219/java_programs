package com.java.srv.linklist;

public class SearchLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        Node head= new Node(10);
        Node sec = new Node(20);
        Node third= new Node(30);
        Node forth= new Node(40);
        Node fifth= new Node(50);

        head.next=sec;
        sec.next=third;
        third.next=forth;
        forth.next=fifth;

        display(head);
        int val = 10;
       boolean result= search(head , val);
        System.out.println(result);
    }

    private static boolean search(Node head, int val) {
        //int val=80;
        Node duplicate =head;
        while (duplicate.next!=null){
            if (val== duplicate.data){
                return true;
            }
            duplicate=duplicate.next;
        }
        return false;
    }

    private static void display(Node head) {
        Node duplicate= head;
        while (duplicate!=null){
            System.out.println(duplicate.data);
            duplicate=duplicate.next;
        }
    }

}
