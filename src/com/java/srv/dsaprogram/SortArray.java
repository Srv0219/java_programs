package com.java.srv.dsaprogram;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0,8,2,1};

        sortArray(arr);
    }

    private static void sortArray(int[] arr) {
        int str=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    str=arr[i];
                    arr[i]=arr[j];
                    arr[j]=str;

                }
            }

        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
