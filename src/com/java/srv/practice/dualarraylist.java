package com.java.srv.practice;

import java.util.ArrayList;

public class dualarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr =new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<4;i++){
            arr.add(new ArrayList<>());
        }
        arrDepthFirst(arr,0,1);
        arrDepthFirst(arr,0,2);
        arrDepthFirst(arr,1,2);
        arrDepthFirst(arr,2,0);
        arrDepthFirst(arr,2,3);
        arrDepthFirst(arr,3,3);

       printArrayList(arr);

    }

    private static void printArrayList(ArrayList<ArrayList<Integer>> arr) {
        for (int i=0;i<arr.size();i++){
            System.out.print(i+"->");
            for (int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void arrDepthFirst(ArrayList<ArrayList<Integer>> arr ,int a,int b){

        arr.get(a).add(b);
    }
}
