package com.java.srv.array;

public class DistanceBetweenVal {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,1,2};
        distanceBetween(arr);
    }

    private static void distanceBetween(int[] arr) {
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]+" "+count);
                }
                count++;
            }
            count=0;
        }
    }
}
