package com.java.srv.array;

import java.util.ArrayList;

public class ReverseGroupInArray {
    public static void main(String[] args) {
        int val = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        reversGroup(arr, val);
    }

    private static void reversGroup(int[] arr, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        int end = (arr.length / val);
        int counter = end;
        int start = 0;

        for (int k = 0; k <= counter; k++) {
            if (count < counter) {
                for (int i = end; i >= start; i--) {
                    al.add(arr[i]);
                }
                System.out.println(al);
                start = start + end + 1;
                end = end + end + 1;
                count++;
            } else {
                for (int i = arr.length - 1; i >= (count * (counter + 1)); i--) {
                    al.add(arr[i]);
                }
                System.out.println(al);
            }
        }


        //  int size= arr.length/val;
        // System.out.println(size);

       /* ArrayList<Integer> al =new ArrayList<>();
        int count=0;
        int end = (arr.length/val);
        int counter=end;
        int start = 0;
        Stack<Integer> stack = new Stack<>();
        for(int j = 0 ;j< end ; j++){
            for(int i = start ; i< end+start ; i++){
                stack.push(arr[i]);
            }
            start = end+start;
            while (!stack.isEmpty()){
                al.add(stack.pop());
            }
        }*/
        System.out.println(al);
    }
}
