package com.java.srv.array;

public class CountDuplicate {
    public static void main(String[] args) {
        int[] arr ={1,2,1,1,1,1,2,2,2,3,5,8};
        int[] arr2 = new int[arr.length];
        distinctPrint(arr , arr2);
    }

    private static void distinctPrint(int[] arr , int [] arr2) {
        int count = 0;
        boolean[] v = new boolean[arr.length];
       // int sort=0;
        for (int i=0;i< arr.length;i++){
            if (v[i]==false) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        v[j] = true;
                        count++;
                    }
                }
            }
            arr2[i] = count+1;
            count = 0;
        }
        for (int i=0;i< arr.length;i++){
            if(v[i]==false){
                System.out.println(arr[i] + ":"+ arr2[i]);
            }
        }


    }
}
