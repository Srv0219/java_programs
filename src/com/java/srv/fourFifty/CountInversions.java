package com.java.srv.fourFifty;

public class CountInversions {
    public static void main(String[] args) {
        int arr[]={2, 4, 1, 3, 5};
        int l=0;
        int h= arr.length-1;
        mergeSort(l,h,arr);
    }

    private static void mergeSort(int l, int h,int []arr) {
        if (l<h){
            int mid=(l+h)/2;
            mergeSort(l,mid,arr);
            mergeSort(mid+1,h,arr);
            merge(l,mid,h,arr);
        }
    }

    private static void merge(int l, int mid, int h, int[] arr) {
    }
}
