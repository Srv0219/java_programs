package com.java.srv.practice;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(5);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.contains(5));
        System.out.println(stack.empty());
        System.out.println(stack.get(1));
        System.out.println(stack.set(3,6));
        System.out.println(stack);
    }
}
