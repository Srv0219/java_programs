package com.java.srv.linklist;

import java.util.LinkedList;

public class LinkListReverseNo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};

        reverseNo(arr);
    }

    private static void reverseNo(int[] arr) {
        int val=0;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0;i< arr.length;i++){
            list.add(arr[i]);
        }

        if (list == null ){


        }

    }
}
