package com.java.srv.array;

public class SortZeroRight {
    public static void main(String[] args) {
        int[] arr ={1,0,2,0,4,0,3,0,5,6,7,0,8,9};

        int[] ans =shortZero(arr);
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i]);

        }
    }

    private static int [] shortZero(int[] arr) {
        int k=0;
        int[] str = new int[arr.length];
        for (int i=0;i< arr.length;i++){
            if(arr[i]>0){
               str[k]=arr[i];
               k++;
            }
        }
        while (k < arr.length){
            str[k]=0;
            k++;
        }
        return str;
    }
}
