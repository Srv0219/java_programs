package com.java.srv.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NoOfPath2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new  ArrayList<ArrayList<Integer>>();
        int src=2;
        int des =3;
        for (int i=0;i<4;i++){
            arr.add(new ArrayList<>());
        }
        arrAdd(arr,0,3);
        arrAdd(arr,0,1);
        arrAdd(arr,0,2);
        arrAdd(arr,1,3);
        arrAdd(arr,2,0);
        arrAdd(arr,2,1);

        // arrPrint(arr);
        bfs(arr,src,des);
    }

    private static void bfs(ArrayList<ArrayList<Integer>> arr, int src, int des) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[4];
       // visited[src]=true;
        queue.add(src);

        while (queue.size()!=0){
            int path =queue.poll();
            System.out.println(path);
            for (int i:arr.get(path)){
                if (visited[i]==false){
                    visited[i]=true;
                    queue.add(i);
                    System.out.println(queue);
                }
                // System.out.println(arr.get(str).get(i));

            }

        }
         //visited[src] = false;


    }

    private static void arrPrint(LinkedList<Integer> path) {
        for (int i:path){
            System.out.println(i);
        }
    }

    private static void arrPrint(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }

    public static void arrAdd(ArrayList<ArrayList<Integer>> arr,int a, int b){
        arr.get(a).add(b);
    }
}
