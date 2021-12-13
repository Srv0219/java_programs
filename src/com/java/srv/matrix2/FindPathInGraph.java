package com.java.srv.matrix2;

import java.util.ArrayList;

public class FindPathInGraph {
    public static void main(String[] args) {
        int vrtcs = 7;
        int edges = 8;
        int src = 0;
        int des = 6;
        ArrayList<Edge>[] graph = new ArrayList[edges];
        for (int i = 0; i < edges; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 10));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 2, 10));

        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, 10));

        graph[3].add(new Edge(3, 2, 10));
        graph[3].add(new Edge(3, 0, 10));
        graph[3].add(new Edge(3, 4, 10));

        graph[4].add(new Edge(4, 3, 10));
        graph[4].add(new Edge(4, 5, 10));
        graph[4].add(new Edge(4, 6, 10));

        graph[5].add(new Edge(5, 4, 10));
        graph[5].add(new Edge(5, 6, 10));

        graph[6].add(new Edge(6, 5, 10));
        graph[6].add(new Edge(6, 4, 10));

        /*for (int i=0;i< graph.length;i++){
            System.out.print(graph[i]);
           for (int j=0;j<graph[i].size();j++){
               System.out.println(graph[i].get());
           }
        }*/
        hasPath(graph, src, des);

    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest) {
        if (src == dest) {
            return true;
        }
        /*for (ArrayList<Edge> edge:graph[src]) {

        }*/
        return false;
    }

    static class Edge {
        int v1;
        int v2;
        int v3;

        public Edge(int v1, int v2, int v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }
    }
}
