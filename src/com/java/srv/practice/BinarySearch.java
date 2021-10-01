package com.java.srv.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end = arr.length-1;
        int val=7;

        binarySearch(arr,start,end,val);
    }

    private static void binarySearch(int[] arr, int start, int end, int val) {
        int mid=0;
        while (start<end){
            mid= (start + end)/2;

            if (arr[mid]==val){
                System.out.println(mid);
                break;
            }
            if (arr[mid]<val){
                start=mid+1;
            }
            else if (arr[mid]>val){
                end=mid-1;
            }

        }
    }
}
