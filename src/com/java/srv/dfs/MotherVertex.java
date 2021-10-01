package com.java.srv.dfs;

import java.util.ArrayList;

public class MotherVertex {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) ;
        {
            arr.add(new ArrayList<>());
        }
        addEdge(0, 1, arr);
        addEdge(0, 2, arr);
        addEdge(1, 3, arr);
        addEdge(4, 1, arr);
        addEdge(6, 4, arr);
        addEdge(5, 6, arr);
        addEdge(5, 2, arr);
        addEdge(6, 0, arr);

        System.out.println("mother vertex is :" + dfs(arr, v));

    }

    private static void addEdge(int i, int i1, ArrayList<ArrayList<Integer>> arr) {
        arr.get(i).add(i1);
    }

    public static int dfs(ArrayList<ArrayList<Integer>> arr, int v) {
        boolean[] visited = new boolean[v];
        v = -1;
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfsUtil(visited, arr, v);
                v = i;
            }
        }
        boolean[] check = new boolean[v];
        dfsUtil(check, arr, v);
        for (boolean val : check) {
            if (!val) {
                return -1;
            }
        }
        return v;
    }

    public static void dfsUtil(boolean[] visited, ArrayList<ArrayList<Integer>> arr, int v) {

        if (visited[v] == true) {
            System.out.println(v + " ");
            for (int i = 0; i < arr.get(v).size(); i++) {
                int n = arr.get(v).get(i);
                if (!visited[n] == false) {

                    dfsUtil(visited, arr, n);
                }

            }
        }

    }


}
