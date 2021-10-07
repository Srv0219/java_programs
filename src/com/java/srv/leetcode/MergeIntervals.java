package com.java.srv.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 4},
                {0, 4},
                {8, 10},
                {15, 18}};
        mergeTime(arr);
    }

    private static int[][] mergeTime(int[][] arr) {
        Pair pairs[] = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                stack.push(pairs[i]);
            } else {
                Pair top = stack.peek();
                if (pairs[i].st > top.et) {
                    stack.push(pairs[i]);
                } else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }
        Stack<Pair> result = new Stack<>();
        while (stack.size() > 0) {
            result.push(stack.pop());
        }
       /* while (result.size()>0){
            Pair p = result.pop();
            System.out.println(p.st +" "+ p.et);
        }*/

        int disp[][] = new int[result.size()][2];
        int i = 0;
        while (result.size() > 0) {

            Pair p = result.pop();
            disp[i][0] = p.st;
            disp[i][1] = p.et;
            System.out.println(disp[i][0] + " " + disp[i][1]);
            i++;
        }
        /*for (int a=0;a< disp.length;a++){
            for (int b=0;b<disp[0].length;b++){
                System.out.println(disp[a][b]);
            }
        }*/
        return disp;
    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        public Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.st != o.st) {
                return this.st - o.st;
            } else {
                return this.et - o.et;
            }
        }
    }
}
