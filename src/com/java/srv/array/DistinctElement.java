package com.java.srv.array;

public class DistinctElement {
    public static void main(String[] args) {
        int[] arr ={1,2,1,3,4,5,9,6,5,6,6,3,7,8,8,8,9};
        distinctPrint(arr);
    }

    private static void distinctPrint(int[] arr) {
        boolean[] v = new boolean[arr.length];
        int sort=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    v[j]=true;

                }
            }
        }
        for (int i=0;i< arr.length;i++){
            if(v[i]==false){
                System.out.println(arr[i]);
            }
        }


    }
}
