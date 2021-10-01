package com.java.srv.Queue;

import java.util.NoSuchElementException;

public class QueueImplementation {
    Node front;
    Node rear;
    int length;

    public QueueImplementation() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }



    public int length() {
        return length;
    }

    public Boolean isEmpty() {
        return length == 0;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;

    }

    public void displayQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ");
    }
    public int deQueue(){
        if (isEmpty()){
            throw  new NoSuchElementException();
        }
        int result= front.data;
        front=front.next;
        if (front==null){
            rear=null;
        }
        length--;
        return result;
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        QueueImplementation newNode = new QueueImplementation();
        newNode.enQueue(10);
        newNode.enQueue(20);
        newNode.enQueue(30);
        newNode.enQueue(40);
        newNode.enQueue(50);
        newNode.enQueue(60);

        System.out.println(newNode.length);
        newNode.displayQueue();
        newNode.deQueue();
        newNode.displayQueue();



    }
}
