package com.java.srv.stack;

public class StackArray {
    static int length;
    int arr[] = new int[1000];

    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        stack.pop();
        stack.pop();

        System.out.println(stack.peek());

    }



    public boolean isEmpty() {
        return length < 0;
    }

    public void push(int data) {
        arr[++length] = data;
    }

    public void pop() {
        int result = arr[length--];
    }

    public int peek() {
        int result = arr[length];
        return result;
    }


}
