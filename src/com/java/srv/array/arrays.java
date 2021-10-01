package com.java.srv.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrays {
    public static void main(String[] args) {
        Integer[] arr ={1,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        List<Integer > list =  Arrays.asList(arr);
         System.out.println(list.get(0));
    }
}
