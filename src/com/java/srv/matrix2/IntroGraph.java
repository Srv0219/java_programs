package com.java.srv.matrix2;

import java.util.ArrayList;

public class IntroGraph {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>(7);
        /*for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<Edge>());
        }*/
        arrDepthFirst(graph, 0, new Edge(0, 3, 40));
        arrDepthFirst(graph, 0, new Edge(0, 1, 10));

        arrDepthFirst(graph, 1, new Edge(1, 0, 10));
        arrDepthFirst(graph, 1, new Edge(0, 3, 10));

        arrDepthFirst(graph, 2, new Edge(2, 3, 10));
        arrDepthFirst(graph, 2, new Edge(2, 1, 10));

        arrDepthFirst(graph, 3, new Edge(3, 0, 40));
        arrDepthFirst(graph, 3, new Edge(3, 2, 10));
        arrDepthFirst(graph, 3, new Edge(3, 4, 2));

        arrDepthFirst(graph, 4, new Edge(4, 3, 2));
        arrDepthFirst(graph, 4, new Edge(4, 5, 3));
        arrDepthFirst(graph, 4, new Edge(4, 6, 3));

        arrDepthFirst(graph, 5, new Edge(5, 4, 3));
        arrDepthFirst(graph, 5, new Edge(5, 6, 3));

        arrDepthFirst(graph, 6, new Edge(6, 5, 3));
        arrDepthFirst(graph, 6, new Edge(6, 4, 8));

        for (int i=0;i< graph.size();i++){
            System.out.print("index is"+i);
            for (int j=0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j));
            }
            System.out.println();
        }

    }

    public static void arrDepthFirst(ArrayList<ArrayList<Edge>> graph, int v, Edge edge) {
        graph.get(v).add(edge);

    }

    public static class Edge {
        int src;
        int nbr;
        int wt;

        public Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
}
