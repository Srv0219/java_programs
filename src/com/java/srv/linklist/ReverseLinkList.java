package com.java.srv.linklist;

public class ReverseLinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addData(10);
        list.addData(20);
        list.addData(30);
        list.addData(40);
        list.addData(50);
       // System.out.println( list.reverseList());
        System.out.println(list.reversePointerIterative());
    }
    public  static class Node{
        int data;
        Node next;
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
            }
            else {
                tail.next=node;
                tail=node;
            }
            size++;
        }
        private Node getNodeAt(int idx){
            Node temp=head;
            for (int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp;
        }
        public int reverseList(){
            int li=0;
            int ri=size-1;
            while (li<ri){
                Node left =getNodeAt(li);
                Node right =getNodeAt(ri);
                int temp=left.data;
                left.data=right.data;
                right.data=temp;

                li++;
                ri--;
                System.out.println(right.data+" "+left.data);
            }
            return 0;
        }
        public int reversePointerIterative(){
            Node prev=null;
            Node curr=head;

            while (curr!=null){
                Node next=curr.next;

                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node temp=head;
            head=tail;
            tail=temp;
          return tail.data;
        }
    }
}
