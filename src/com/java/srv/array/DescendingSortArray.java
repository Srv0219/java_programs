package com.java.srv.array;

public class DescendingSortArray {
    public static void main(String[] args) {
        int[] arr ={4,6,2,3,1,5,8,9,7,0};


        int[] arr2 =descSortArray(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr2[i]);
        }
    }

    private static int[] descSortArray(int[] arr) {
        int temp=0;
        //Descending Order
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++) {
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //Ascending Order
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++) {
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
