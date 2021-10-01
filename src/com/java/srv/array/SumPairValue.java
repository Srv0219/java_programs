package com.java.srv.array;

public class SumPairValue {
    public static void main(String[] args) {
        int[] arr ={2,3,1,4,6,5};
        int val=5;
        sumPair(arr,val);
    }

    private static void sumPair(int[] arr,int val) {
        int str=0;
       // int j=1;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                str=arr[i]+arr[j];
                if(str==val){
                    System.out.println(arr[i]+" "+arr[j]+" - "+str);
                }
            }
        }
    }
}
