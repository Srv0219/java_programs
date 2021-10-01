package com.java.srv.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CyclicGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i< 3;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
       // graphprint(adj);
        System.out.println(bfsDisplay(adj,0));
    }

    private static boolean bfsDisplay(ArrayList<ArrayList<Integer>> adj, int s) {
        int V = 4;
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();
        int[] parent = new int[V];

        visited[s]=true;
        queue.add(s);
       while (queue.size()!=0){
           int val = queue.poll();

           for (int i=0;i<adj.get(s).size();i++){
               int ad=adj.get(val).get(i);
               if (visited[ad]==false){

                   visited[ad] = true;
                   queue.add(ad);
                   parent[ad]=val;
               }
               else if (parent[val] != ad)
                   return true;
           }
       }
return false;
    }


    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int a, int b) {
        adj.get(a).add(b);
    }
    public static void graphprint(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }
}
