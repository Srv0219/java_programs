package com.java.srv.array;

public class FirstTwoInLast {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};

        int[] ans =firstTwoNumberSwap(arr);
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i]);

        }
    }

    private static int [] firstTwoNumberSwap(int[] arr) {
        int j=0;
        int v=0;
        int[] str =new int[arr.length];
        for (int i=3;i< arr.length;i++){
            str[v]=arr[i];
            v++;

        }
        while(arr.length>v){
            str[v]=arr[j];
            v++;
            j++;
        }


   return  str;
    }
}
