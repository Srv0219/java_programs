package com.java.srv.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        int[] arr = { 10, 34, 5, 10, 3, 5, 10 };
        ArrayList<Integer> cars = new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++){
            cars.add(arr[i]);
        }

        //  iterator
        System.out.println("iterator");
        Iterator<Integer> it =cars.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //enhance foor loop
        System.out.println("enhance foor loop");
        for(int i:cars){
            System.out.println(i);
        }
    }
}
