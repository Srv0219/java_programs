package com.java.srv.stack;

public class StackArrayImplementation {
    static  int max= 1000;
    static  int top;
    static  int arr[]= new int[max];

    public boolean isEmpty(){

        return (top<0);
    }

    public  boolean push(int x){

        arr[++top] = x;
        return true;

    }
    public  boolean pop(){

       int x=arr[top--];
        return true;

    }
    public  int peek(){

        int x=arr[top];
        return x;

    }

    public static void main(String[] args) {
        StackArrayImplementation stack= new StackArrayImplementation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        System.out.println(stack.peek());
        stack.push(60);
        System.out.println(stack.peek());

    }

}
