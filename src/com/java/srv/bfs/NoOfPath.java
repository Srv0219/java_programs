package com.java.srv.bfs;

import java.util.*;

public class NoOfPath {
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
        System.out.println(bfs(arr,src,des));
    }

    private static List<List<Integer>>  bfs(ArrayList<ArrayList<Integer>> arr, int src, int des) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        System.out.println(Arrays.asList(0));
        queue.add(Arrays.asList(0));
        while (queue.size()!=0){
            List<Integer> path = queue.poll();
           int last= path.get(path.size()-1);
           if (src == last){
               result.add(new ArrayList<>(path));
           }
           else {
               for (int i:arr.get(last)){
                   List<Integer> li =new ArrayList<>(path);
                   li.add(i);
                   queue.add(li);
               }
           }
        }
        return result;

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
