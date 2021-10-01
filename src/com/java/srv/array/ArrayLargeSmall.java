package com.java.srv.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ArrayLargeSmall {
    public static void main(String[] args) {
        int arr[]={4,62,23,7,9,42,8,3,1,10,5};

        largeSmall(arr);
    }

    private static void largeSmall(int[] arr) {
        Boolean temp=true;
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        Arrays.sort(arr);
        int k=0;
        int i=arr.length/2;
        for (int j=i;j< arr.length;j++){
           st.add(arr[j]);
        }
        while (k<=i){
            if (temp){
                al.add(st.pop());

            }
            else {
                al.add(arr[k]);
                k++;
            }

          temp=!temp;

        }
        for (int v =0;v< arr.length;v++){
            System.out.print(arr[v]+" ");
        }

        System.out.println(" ");
        for (int v =0;v< al.size();v++){
            System.out.print(al.get(v)+" ");
        }

    }
}
