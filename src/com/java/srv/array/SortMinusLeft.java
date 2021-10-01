package com.java.srv.array;

public class SortMinusLeft {
    public static void main(String[] args) {
        int[] arr ={0,1,7,3,-3,2,4,-6,-5,-1,6,-2};
        int[] ans =sortMinus(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

    private static int [] sortMinus(int[] arr) {
        int k=0;
        int[] str =new int[arr.length];
        for (int i =0;i< arr.length;i++) {
            if ( arr[i]<0) {
                str[k] = arr[i];
                  k++;
            }

        }
            for(int j=0;j< arr.length;j++){
                if(0<=arr[j]){
                    str[k]=arr[j];
                    k++;
                }
        }
       return str;
    }
}
