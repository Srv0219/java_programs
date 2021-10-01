package com.java.srv.array;

public class BigToSmall {
    public static void main(String[] args) {
       int[] arr ={1,2,3,4,5,6,7,8,9};

      int[] ans = bigToSmallSwap(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int [] bigToSmallSwap(int[] arr) {
        boolean flag=true;
        int[] str =new int[arr.length];
       int i=0;
        int k=0;
        int j= arr.length-1;
        while(i<=j){
            if (flag==true){
                str[k]=arr[i];
                k++;
                i++;
            }
             else{
                str[k]=arr[j];
              k++;
              j--;
            }
             flag=!flag;//note to flip the loop

        }
       return str;
    }
}
