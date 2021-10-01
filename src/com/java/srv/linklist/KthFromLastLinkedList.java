package com.java.srv.linklist;

public class KthFromLastLinkedList {
    public static void main(String[] args) {

    }
    public static class Node{
        Node next;
        int data;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        public void addData(int val){
            Node node = new Node();
            node.data=val;
            node.next=null;
            if (size==0){
                head=tail=node;
            }else {
                tail.next=node;
                tail=node;
            }
        }
        public void kthFromLast(int k){
            Node slow=head;
            Node fast=head;
            for (int i=0;i<10;i++){

            }
        }
    }
}
