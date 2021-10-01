package com.java.srv.dfs;

import java.util.ArrayList;

public class CyclicPath {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }
        checkEdge(arr, 0, 1);
        checkEdge(arr, 1, 2);
        checkEdge(arr, 2, 3);
        checkEdge(arr, 3, 4);
        checkEdge(arr, 4, 0);

        printEdge(arr);
        dfsCheck(arr);
    }

    public static void dfsCheck(ArrayList<ArrayList<Integer>> arr) {
        boolean[] visited = new boolean[arr.size()];
        int src = 0;
        int check = 0;

        dfsCyclic(arr, visited, src, check);


    }

    private static void dfsCyclic(ArrayList<ArrayList<Integer>> arr, boolean[] visited, int src, int check) {

        visited[src] = true;
        for (int i = 0; i < arr.get(src).size(); i++) {
            int n = arr.get(src).get(i);
            if (check == n) {
                System.out.println("is cyclic");
            }
            if (visited[n] == false) {
                dfsCyclic(arr, visited, n, check);
            }
        }
    }

    private static void printEdge(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void checkEdge(ArrayList<ArrayList<Integer>> arr, int a, int b) {
        arr.get(a).add(b);
    }

}
