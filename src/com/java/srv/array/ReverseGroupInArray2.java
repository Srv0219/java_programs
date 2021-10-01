package com.java.srv.array;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseGroupInArray2 {
    public static void main(String[] args) {
        int val = 5;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reversGroup(arr, val);
    }

    private static void reversGroup(int[] arr, int val) {
        int end = (arr.length / val);
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        int counter = 0;
        while (end>=0) {
            for (int i = count; i < val; i++) {
                stack.push(arr[i]);
            }
            count=val;
           // val

            while (!stack.isEmpty()) {
                al.add(stack.pop());
            }
            System.out.println(al);
            end--;

        }
       /*
        int count = 0;
        int counter = 0;
        int start = end;


            for (int i = 0; i < end; i++) {
                for (int j = start - 1; j >= count; j--) {
                    al.add(arr[j]);
                    counter++;
                }
                System.out.println(al);
                count = counter;
                start = start + end;
            }*/



    }

}
