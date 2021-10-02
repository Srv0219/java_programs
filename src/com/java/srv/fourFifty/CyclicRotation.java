package com.java.srv.fourFifty;

import java.util.Stack;

public class CyclicRotation {
    public static void main(String[] args) {
        int N = 3;
        int A[] = {1, 2, 3, 4, 5, 6};

        cyclicRotation(A, N);
    }

    private static void cyclicRotation(int[] a, int n) {
        if (n > a.length) {
            System.out.println("cannot be cyclic because given length is greater than array length ");
        } else {
            int temp[] = new int[n];
            int str = 0;
            Stack<Integer> stack = new Stack<>();
            for (int i = a.length - 1; i >= a.length - n; i--) {
                stack.add(a[i]);
            }
            for (int i = a.length - (n + 1); i >= 0; i--) { //2, 3, 4
                a[i + n] = a[i];
            }
            for (int i = stack.size() - 1; i >= 0; i--) {
                a[i] = stack.pop();
            }
        }
    }
}
