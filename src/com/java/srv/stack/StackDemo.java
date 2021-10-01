package com.java.srv.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);


        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        st.add(80);
        st.push(90);
        System.out.println(st);

    }

}
