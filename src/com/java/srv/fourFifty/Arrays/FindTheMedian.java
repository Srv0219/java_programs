package com.java.srv.fourFifty.Arrays;

import java.util.Arrays;

public class FindTheMedian {
    public static void main(String[] args) {
       int arr[] = {90, 100, 78, 89, 67};
       median(arr);
    }

    private static int median(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2!=0){
            System.out.println(arr[(n)/2]);
            return arr[(n)/2];
        }
        System.out.println((arr[n/2]+arr[(n/2)-1])/2);
        return (arr[n/2]+arr[(n/2)-1])/2;
    }
}
