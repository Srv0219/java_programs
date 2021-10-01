package com.java.srv.array;

public class MaximumArray {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;

        int[] arr ={5,4,7,9,2,3};

        maxArray(arr,a);
    }

    private static void maxArray(int[] arr, int a) {
        for (int i=0;i< arr.length;i++){
            if(a<arr[i]){
                a=arr[i];
            }

        }
        System.out.println(a);
    }
}
