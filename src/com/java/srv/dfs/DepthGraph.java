package com.java.srv.dfs;

import java.util.ArrayList;

public class DepthGraph {

    public static void main(String[] args) {
        int a =0;
        int b =0;

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(5);
        for (int i=0;i<5;i++){
            arr.add(new ArrayList<>());
        }

        arrDepth(arr,0,1);
        arrDepth(arr,0,2);
        arrDepth(arr,0,3);
        arrDepth(arr,1,4);
        arrDepth(arr,2,4);
        arrDepth(arr,3,4);

        for (int i=0;i< arr.size();i++){
            System.out.print("index is"+i);
            for (int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }

    }
    public static void arrDepth(ArrayList<ArrayList<Integer>> arr,int a,int b ){
        arr.get(a).add(b);

    }


}
