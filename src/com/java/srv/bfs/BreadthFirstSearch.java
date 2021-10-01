package com.java.srv.bfs;

import java.util.ArrayList;
import java.util.LinkedList;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 4; i++) {
            arr.add(new ArrayList<>());
        }
        graphAdd(arr, 0, 1);
        graphAdd(arr, 0, 2);
        graphAdd(arr, 1, 2);
        graphAdd(arr, 2, 0);
        graphAdd(arr, 2, 3);
        graphAdd(arr, 3, 3);
        graphprint(arr);

        bfsSearch(arr, 1);


    }

    private static void bfsSearch(ArrayList<ArrayList<Integer>> arr, int s) {
        boolean[] visited = new boolean[4];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            int val = queue.poll();
            System.out.println(val);

            for (int i = 0; i < arr.get(val).size(); i++) {
                if (visited[arr.get(val).get(i)] == false) {
                    visited[arr.get(val).get(i)] = true;
                    queue.add(arr.get(val).get(i));

                }
            }
        }
    }

    public static void graphAdd(ArrayList<ArrayList<Integer>> arr, int a, int b) {

        arr.get(a).add(b);
    }

    public static void graphprint(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }

}
