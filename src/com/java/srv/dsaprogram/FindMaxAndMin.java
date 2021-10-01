package com.java.srv.dsaprogram;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {24,2,3,4,36,5,6,7,8,9,0};
        maxAndMin(arr);
    }

    private static void maxAndMin(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
             if(max<arr[i]){
                max=arr[i];
            }
            else if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("Min :"+min);
        System.out.println("Max :"+max);


    }
}
