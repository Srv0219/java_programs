package com.java.srv.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,5,7};
        List<Integer> li =new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            li.add(arr[i]);
        }
        li.add(7,8);
        Collections.sort(li);
        li.forEach(System.out::println);
        //System.out.println(li);

    }
}
