package com.java.srv.stack;

import java.util.EmptyStackException;

public class StackImpleamentation {
    static Node top;
    static int length;

    public StackImpleamentation() {
        top = null;
        length = 0;
    }

    public static int length() {
        return length;
    }

    public static boolean isEmpty() {
        return length == 0;
    }

    private static int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    private static int push(int data) {

        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;

        return length;

    }

    public static void main(String[] args) {
        StackImpleamentation stack = new StackImpleamentation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(length());

    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
