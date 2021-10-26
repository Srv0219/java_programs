package com.java.srv.fourFifty.Arrays;

public class MinMaxArr {
    public static void main(String[] args) {
        int arr[] = {-21,1, 2, 3, 4, 5,21, 6, 7, 8, 9};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
