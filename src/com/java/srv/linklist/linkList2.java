package com.java.srv.linklist;

public class linkList2 {
    public static void main(String[] args) {

        LinkList1 list1 = new LinkList1();
        list1.addData(1);
        list1.addData(2);
        list1.addData(3);
        list1.addData(4);
        list1.addData(5);

       // list1.addNode(10);

        System.out.println("Display Data : " + list1.displayData());
      /*  System.out.println("First : " + list1.getFirst());
        System.out.println("Last : " + list1.getLast());
        System.out.println("GetAt : " + list1.getAt(8));*/

        list1.addAt(3,200);
    }

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkList1 {
        Node head;
        Node tail;
        int size;

        public void addData(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }


        //First index
        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        //Last index
        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        //Get Index
        public int getAt(int indx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (indx < 0 || indx >= size) {
                System.out.println("Invalid Argument");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < indx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        //addNode at first
        public int addNode(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if (size == 0) {
                tail = temp;
            }
            size++;
            return temp.data;
        }

        // displayData
        public int displayData() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println();
            return temp.data;
        }

        // add at index

        public void addAt(int indx, int val) {
            Node node = new Node();
            node.data = val;

            Node temp = head;
            for (int i = 0; i < indx - 1; i++) {
                temp=temp.next;

            }
            node.next=temp.next;
            temp.next=node;
        }
    }
}
