package com.java.srv.linklist;

public class RemoveLastLinklist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addData(10);
        list.addData(20);
        list.addData(30);
        list.addData(40);
        list.addData(50);
        System.out.println( list.removeLast());
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
        public int removeLast(){
            if (size==0){
                System.out.println("List is empty");
            }else if (size==1){
                head=tail= null;
                size=0;
            }else {
                Node node =head;
                for (int i=0;i<size-2;i++){
                    node=node.next;
                }
                tail=node;
                node.next=null;
                size--;
                return node.data;
            }
            return 0;
        }
    }
}
