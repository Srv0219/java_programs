package com.java.srv.stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
       int[] disp = solve(arr);
       for (int i=0;i< disp.length;i++){
           System.out.println(disp[i]);
       }

    }

    private static int[] solve(int[] arr) {
        int[] ar1 = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        ar1[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.size() == 0) {
                ar1[i] = -1;

            } else {
                ar1[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return ar1;
    }
}
