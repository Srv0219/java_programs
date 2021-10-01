package com.java.srv.dfs;

import java.util.ArrayList;

public class AppendArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(5);

        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<Integer>());
        }
        arrEdge(adj, 0, 1);
        arrEdge(adj, 0, 4);
        arrEdge(adj, 1, 2);
        arrEdge(adj, 1, 3);
        arrEdge(adj, 1, 4);
        arrEdge(adj, 2, 3);
        arrEdge(adj, 3, 4);
        printGraph(adj);

    }

    private static void arrEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        //adj.get(v).add(u);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("adjacent list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
}
