package com.java.srv.dfs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologyAllPath {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }

        addEdge(arr, 5, 2);
        addEdge(arr, 5, 0);
        addEdge(arr, 4, 0);
        addEdge(arr, 4, 1);
        addEdge(arr, 2, 3);
        addEdge(arr, 1, 3);

      /*  addEdge(arr,0,1);
        addEdge(arr,0,2);
        addEdge(arr,1,2);
        addEdge(arr,2,0);
        addEdge(arr,2,3);
        addEdge(arr,3,3);
*/
        printList(arr, v);
        dfsTopo(arr, v);
    }

    private static void dfsTopo(ArrayList<ArrayList<Integer>> arr, int v) {
        boolean[] visited = new boolean[arr.size()];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                stack = dfsTopoUtil(arr, visited, i, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }


    }

    private static Stack<Integer> dfsTopoUtil(ArrayList<ArrayList<Integer>> arr, boolean[] visited,
                                              int k, Stack<Integer> stack) {
        visited[k] = true;
        System.out.print(k + "->");

        int n = 0;
        for (int i = 0; i < arr.get(k).size(); i++) {
            n = arr.get(k).get(i);
            if (visited[n] == false) {
                dfsTopoUtil(arr, visited, n, stack);
            }
            //stack.push(n);
        }
        //stack.push(k);
        stack.push(n);

        return stack;
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> arr, int a, int b) {
        arr.get(a).add(b);
    }


    public static void printList(ArrayList<ArrayList<Integer>> arr, int v) {

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i + " ->");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
