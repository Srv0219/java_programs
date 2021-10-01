package com.java.srv.dsaprogram;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int i= arr.length-1;
        while (i>=0){
            System.out.println(arr[i]);
            i--;
        }
    }
}
