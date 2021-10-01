package com.java.srv.array;

public class findBiggestNoInArray {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int[] arr ={1,2,5,4,3,6,8};
        for(int i =0 ; i < arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                System.out.println("larget array :"+max );
            }

        }


    }
}
