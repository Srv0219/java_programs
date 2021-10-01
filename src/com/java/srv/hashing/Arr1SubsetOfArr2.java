package com.java.srv.hashing;

public class Arr1SubsetOfArr2 {
    public static void main(String[] args) {
        int[] arr1 ={1,-2,3,4,5,6};
        int[] arr2 ={-2,4,6};
        subSet(arr1,arr2);
    }

    private static void subSet(int[] arr1, int[] arr2) {
        int count=0;
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                    break;
                }
            }
        }
        if (count==arr2.length){
            System.out.println("subset of arr1");
        }
        else {
            System.out.println("not a subset of arr1");
        }
    }
}
