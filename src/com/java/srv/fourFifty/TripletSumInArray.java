package com.java.srv.fourFifty;

public class TripletSumInArray {
    public static void main(String[] args) {
       int x = 13;
       int arr[] = {1 ,4 ,45 ,6 ,10 ,8};

       findTripletSum(arr,x);
    }

    private static boolean findTripletSum(int[] arr, int x) {
        int count=0;
        int sum;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k< arr.length;k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if (sum==x){
                        count++;
                    }
                }
            }
        }
        boolean b;
        if (count>0){
            b=true;
        }
        else {
            b=false;
        }
        System.out.println(count);
        return b;
    }
}
