package com.java.srv.dfs;

import java.util.ArrayList;

public class AddColor {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Red");
        arr.add("Green");
        arr.add("Orange");
        arr.add("White");
        arr.add("Black");
        System.out.print(arr+" ");
        System.out.println();
        for (String i:arr){
            System.out.println(i);
        }
    }
}
