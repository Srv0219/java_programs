package com.java.srv.practice.StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListArray {
    public static void main(String[] args) {
        List<Integer> al =  Arrays.asList(1,2,3,4,5,8,7,8,9);

        //enhance for loop
       for (int i:al){
           System.out.println(i);
       }

       //
        Iterator<Integer> it = al.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }

       al.forEach(i -> System.out.println(i));
    }
}
