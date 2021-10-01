package com.java.srv.linklist;

public class LinklistAddAt {
    public static void main(String[] args) {
       LinkList3 list1 = new LinkList3();
        list1.addData(1);
        list1.addData(2);
        list1.addData(3);
        list1.addData(4);
        list1.addData(5);
        System.out.println(list1.displayData());
        System.out.println(list1.addAt(200,3));

    }

    public static class Node{
        int data;
        Node next;

    }
    public static class LinkList3{
        Node head;
        Node tail;
        int size;

        public int addData(int val){
            Node node = new Node();
            node.data=val;
            node.next= null;
            if (size==0){
                head=tail=node;
            }
            else {
                tail.next=node;
                tail=node;
            }
            size++;
            return node.data;
        }

        public int addAt(int val,int indx){
            Node node = new Node();
            node.data=val;

            Node temp =head;
            for (int i=0;i<indx-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
            return node.data;
        }

        public int  displayData(){
            Node temp = head;
            while (temp!=null){

              System.out.println(temp.data+" ");
                temp = temp.next;
                return temp.data;
            }
            System.out.println();
            return temp.data;
        }
    }
}
