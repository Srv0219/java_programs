package com.java.srv.dfs;

import java.util.ArrayList;

public class ArraylistAdd {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new  ArrayList<ArrayList<Integer>>(3);
        ArrayList<Integer> arr2=new ArrayList<>();
        for (int i=0;i< 1;i++) {
            arr.add(new ArrayList<>());

        }
        for (int j=0;j<=arr.get(0).size();j++){

            arr2.add(1);
            arr2.add(2);
            arr2.add(3);
            arr2.add(4);

        }

        arr.add(arr2);
        System.out.println(arr.size());


        for (int i=0;i< arr.size();i++)
        {
            for (int j=0;j<= arr.get(i).size()-1;j++)
            {
                {
                System.out.println(arr2.get(j));
            }
            }
        }
    }

}
