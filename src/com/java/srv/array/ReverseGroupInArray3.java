package com.java.srv.array;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseGroupInArray3 {
    public static void main(String[] args) {
        int val=4;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> al =new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        //al.add(9);
     //3 ,3 (8-6)   0,3  3,6
        reverseGroup(arr,val);

    }

    private static void reverseGroup(int[]arr, int val) {
        Stack<Integer> stack = new Stack<>();
     ArrayList<Integer> al2 = new ArrayList<>();
        int end = (arr.length / val);
         /*  int end = (al.size() / val);
        while (end >= 0) {
            for (int i = 0; i < val; i++) {
                System.out.println(al.get(i));
                stack.push(al.get(i));
            }
            for (int i = 0; i < val; i++) {
                System.out.println(al.get(i));
                al.remove(al.get(i));
            }
            while (!stack.isEmpty()) {
                al2.add(stack.pop());
            }
            System.out.println(al2);
            end--;
        }*/

        int count =0;
        int j = 0;
        for(int i = 0 ; i <=end ; i++){
            while(count<val){
                try {
                    stack.push(arr[j]);
                    count++;
                    j++;
                }catch (Exception e){
                    count++;
                    continue;

                }

            }
            count =0;
            while (!stack.isEmpty()){
                al2.add(stack.pop());
            }
        }

        System.out.println(al2);
    }
}
