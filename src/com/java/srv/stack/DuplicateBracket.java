package com.java.srv.stack;

import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input");
        String str = "(a+b)+((c+d))";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println("duplicate");
                } else {
                    while (st.peek() != '(') {
                        System.out.println(st.pop());

                    }
                    System.out.println(st.pop());
                }

            } else {
                st.push(ch);
            }
        }
        System.out.println("Not duplicate");
    }
}
