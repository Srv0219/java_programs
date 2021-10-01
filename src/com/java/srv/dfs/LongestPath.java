package com.java.srv.dfs;

import java.util.ArrayList;

public class LongestPath {
    public static void main(String[] args) {
        int v = 5;
        int src = 0;
        int des = 3;
        int pathC = 0;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }
        addEdge(arr, 0, 1);
        addEdge(arr, 0, 2);
        addEdge(arr, 0, 3);
        addEdge(arr, 1, 3);
        addEdge(arr, 2, 3);
        addEdge(arr, 1, 4);
        addEdge(arr, 2, 4);

        dfsPrint(arr, v);// print dfs graph

        ArrayList<ArrayList<Integer>> allpath = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<>();


        boolean[] visited = new boolean[5];
        allpath = pathCount(arr, src, des, pathC, visited, allpath, path);

        longestPath(allpath);


    }

    private static void longestPath(ArrayList<ArrayList<Integer>> allpath) {
        int max = Integer.MIN_VALUE;
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> arrayList = null;


        for (int i = 0; i < allpath.size(); i++) {
            int n = allpath.get(i).size();
            if (n >= max) {
                arrayList = new ArrayList<Integer>();

                for (int j = 0; j < allpath.get(i).size(); j++) {
                    max = n;
                    arrayList.add(allpath.get(i).get(j));
                    //System.out.print(allpath.get(i).get(j)+ ",");
                }
                arrayLists.add(arrayList);
                // System.out.println();
            }
        }
        System.out.println(arrayLists);
        //System.out.println(dfs);

    }


    private static ArrayList<ArrayList<Integer>> pathCount(ArrayList<ArrayList<Integer>> arr, int src, int des, int pathC, boolean[] Visited,
                                                           ArrayList<ArrayList<Integer>> allpath, ArrayList<Integer> path) {
        if (src == des) {
            allpath.add(new ArrayList(path));

        }

        Visited[src] = true;
        for (int i = 0; i < arr.get(src).size(); i++) {
            int n = arr.get(src).get(i);
            if (Visited[n] == false) {

                path.add(n);
                pathCount(arr, n, des, pathC, Visited, allpath, path);
                path.remove(path.size() - 1);
            }

        }
        // allpath.add(path);
        Visited[src] = false;
        return allpath;
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> arr, int i, int i1) {

        arr.get(i).add(i1);
    }


    public static void dfsPrint(ArrayList<ArrayList<Integer>> arr, int v) {

        for (int i = 0; i < arr.size(); i++) {
            System.out.print("index " + i + " ");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j));

            }
            System.out.println();
        }
    }


}
