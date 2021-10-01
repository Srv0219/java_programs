package com.java.srv.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
        int arr[] = {9, 43, 34, 2, 5, 8, 3, 1, 57};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        Collections.sort(al);
        System.out.println(al);
    }
}
