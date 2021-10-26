package com.java.srv.fourFifty.Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class NegativeElementLeft {
    public static void main(String[] args) {
        int arr[] = {10, -12, 11, -1, -13, -5, 6, -7, 5, 17, -21, 22, -3, -6};

        leftShift(arr);

    }

    private static void leftShift(int[] arr) {
        int val = 0;
        Queue<Integer> plus = new LinkedList<>();
        Queue<Integer> minus = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                plus.add(arr[i]);
            } else if (arr[i] < 0) {
                minus.add(arr[i]);

            }
        }
        while (!minus.isEmpty()) {
            arr[val] = minus.poll();
            val++;
        }
        minus=null;
        while (!plus.isEmpty()) {

            arr[val] = plus.poll();
            val++;
        }
       plus=null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
