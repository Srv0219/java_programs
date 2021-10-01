package com.java.srv.linklist;

public class RemoveAtLinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addData(10);
        list.addData(20);
        list.addData(30);
        list.addData(40);
        list.addData(50);
       list.removeAt(2);
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
           size++;
       }
       public void removeAt(int indx){
           if (indx<0||indx>=size){
               System.out.println("invalid Arguments");
           }else if(size==0){
               System.out.println("List is empty");
           }else if(size==1){
               head=tail=null;
           }else {
               Node temp= head;
               for (int i=0;i<indx-1;i++){
                   temp=temp.next;

               }
               temp.next=temp.next.next;
               size--;
           }
       }
    }

}
