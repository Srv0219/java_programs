package com.java.srv.dfs;

import java.util.ArrayList;
import java.util.Collections;

public class AddInFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        arr.add("Red");
        arr.add("Green");
        arr.add("Orange");
        arr.add("White");
        arr.add("Black");
        arr1.add(10);
        arr1.add(9);
        arr1.add(8);
        arr1.add(7);
        arr1.add(6);
        arr1.add(5);
        arr1.add(4);
        arr1.add(3);
        arr1.add(2);
        arr1.add(1);





        System.out.println(arr);

          for (int i=0;i<arr.size();i++){
              System.out.print(arr.get(i)+" ");
          }

//        for (int i=0;i<arr.size();i++){
//            System.out.print(arr.get(0)+" ");
//        }

        System.out.println(arr.indexOf("Orange"));

        arr.set(2,"Yellow");
        System.out.println(arr+" ");
        arr.remove("Yellow");
        System.out.println(arr+" ");

        if (arr.contains("Red")){
            System.out.println(arr.indexOf("Red"));
        }
        else {
            System.out.println(arr.set(2,"Red"));
        }
        arr.add(arr1.toString());

        Collections.sort(arr1);
        System.out.println(arr1);

    }
}
