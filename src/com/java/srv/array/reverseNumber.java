package com.java.srv.array;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseNumber {
    public static void main(String[] args) {
       Integer a=123;

       String st = String.valueOf(a);
        Stack<Character> stack = new Stack<>();

       for(int i = 0 ; i < st.length();i++){
           if (st.charAt(i)!= '-')
           {
               stack.push(st.charAt(i));
           }

       }

       String rev = "";
        if (st.charAt(0)== '-'){
            rev+="-";
        }
           while (!stack.isEmpty()) {
               String c = String.valueOf(stack.pop());
               rev += c;
           }


        System.out.println(Long.parseLong(rev));
    }
}
