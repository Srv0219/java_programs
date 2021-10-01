package com.java.srv.linklist;

import java.util.LinkedList;

public class StackAdapterLinledList {
    public static void main(String[] args) {

    }
    public static class LLToStackAdapter{
        LinkedList<Integer> list ;

        public LLToStackAdapter() {
             list=new LinkedList<>();
        }
        int size(){
            return list.size();
        }
        void push(int val){
            list.addFirst(val);
        }
        int pop(){
            if (size()==0){
                System.out.println("Stack underflow");
            return -1;
            }
            return list.removeFirst();
        }
        int top(){
            if (size()==0){
                System.out.println("Stack underflow");
                return -1;
            }
            return list.getFirst();
        }
    }
}
