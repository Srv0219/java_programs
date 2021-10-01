package com.java.srv.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end= arr.length-1;
        int val=8;

       int index= binarySearch(arr,val,start,end);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int val, int start, int end) {
         int mid=0;
        while (start<=end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == val) {
                return mid;
            }
            if (arr[mid] < val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}


