package com.java.srv.practice;

import java.util.*;

public class allList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        LinkedList<Integer> a2 = new LinkedList<>();
        Stack<Integer> a3 = new Stack<>();
       al.add(1);
       al.add(2);
       al.add(3);
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a3.push(1);
        a3.push(2);
        a3.push(3);
        System.out.println(al);
        System.out.println(a2);
        System.out.println(a3.pop());


    }
}
