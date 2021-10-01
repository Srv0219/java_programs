package com.java.srv.practice;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,5,7};
        Collection<Integer> col = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            col.add(arr[i]);
        }
        //col.add(1,4);
//        for (int i:col){
//            System.out.println(i);
//        }
        col.forEach(System.out::print);
    }
}
