package com.java.srv.array;

public class OddIndexSmallerThenEvenIndex {
    public static void main(String[] args) {
        int[] arr ={1,3,2,1,6,5,7};
        oddIndexEven(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    private static void oddIndexEven(int[] arr) {
        int temp;
        for(int i=0;i< arr.length;i=i+2){
            for (int j=i+1;j< arr.length;j=j+2){
                if(arr[i]<arr[j]){
                    break;
                }
                else if(arr[i]>arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }
}
