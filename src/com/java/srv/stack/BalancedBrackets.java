package com.java.srv.stack;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str0 = "[(a+b)+{(c+d)*(e/f)}]";
        String str1 = "[(a+b)+{(c+d)*(e/f)]}";
        String str2 = "[(a+b)+{(c+d)*(e/f)}";
        String str3 = "([(a+b)+{(c+d)*(e/f)}]";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str0.length(); i++) {
            char ch = str0.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing('(', st);
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing('{', st);
                if (val == false) {
                    System.out.println(val);
                    return;
                }

            } else if (ch == ']') {
                boolean val = handleClosing('[', st);
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            }
        }
        System.out.println(st.size() == 0);

    }

    public static boolean handleClosing(char och, Stack<Character> st) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != och) {
            System.out.println(false);
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
