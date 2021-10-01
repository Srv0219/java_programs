package com.java.srv.bfs;

import java.util.ArrayList;
import java.util.LinkedList;

public class LevelPyramid {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 4; i++) {
            arr.add(new ArrayList<>());
        }
        graphAdd(arr, 0, 1);
        graphAdd(arr, 0, 2);
        graphAdd(arr, 1, 3);
        graphAdd(arr, 2, 4);
        graphAdd(arr, 2, 5);
        //graphprint(arr);

        bfsSearch(arr, 0);


    }

    private static void bfsSearch(ArrayList<ArrayList<Integer>> arr, int s) {
        boolean[] visited = new boolean[6];
        LinkedList<Integer> queue = new LinkedList<>();
        int[] level =new int[6];

        visited[s] = true;
        queue.add(s);
        level[s]=0;
        while (queue.size() != 0) {
             s = queue.poll();
           // System.out.println(s);

            ArrayList<Integer> list = arr.get(s);
            // Get all adjacent vertices
            // of the dequeued vertex s.
            // If a adjacent has not been
            // visited, then mark it
            // visited and enqueue it
            for (int i : list)
            {
               System.out.println(i);
                if (!visited[i])
                {
                    visited[i] = true;
                    level[i] = level[s] + 1;
                    queue.add(i);
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

