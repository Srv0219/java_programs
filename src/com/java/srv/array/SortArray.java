package com.java.srv.array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr ={4,6,2,3,1,5,8,9,7,0};


        int arr2[]=sortArray(arr);
        for (int i=0;i< arr2.length;i++){
            System.out.print(arr2[i]);
        }
      /*  Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));*/
    }

    private static int[] sortArray(int[] arr) {
        int temp=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
