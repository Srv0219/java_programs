package com.java.srv.dfs;

import java.util.ArrayList;

public class DepthFirstSearch {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(v);

        for (int i = 0; i < v; i++) {

            arr.add(new ArrayList<>());
        }
        arrDepthFirst(arr, 0, 1);
        arrDepthFirst(arr, 0, 2);
        arrDepthFirst(arr, 1, 2);
        arrDepthFirst(arr, 2, 0);
        arrDepthFirst(arr, 2, 3);
        arrDepthFirst(arr, 3, 3);

        dfs(arr, 2);


    }

    public static void arrDepthFirst(ArrayList<ArrayList<Integer>> arr, int v, int w) {
        arr.get(v).add(w);

    }

    static void dfs(ArrayList<ArrayList<Integer>> arr, int v) {
        boolean[] visited = new boolean[4];
        dfsUtil(visited, v, arr);
    }

    private static void dfsUtil(boolean[] visited, int v, ArrayList<ArrayList<Integer>> arr) {
        visited[v] = true;
        System.out.print(v + " ,");
        for (int i = 0; i < arr.get(v).size(); i++) {
            int n = arr.get(v).get(i);
            if (visited[n] == false) {
                dfsUtil(visited, n, arr);
            }
        }

        System.out.println();
    }


}
