package com.java.srv.array;

public class productOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int pro = 1;
        for (int i=0;i< arr.length;i++){

            pro*=arr[i];

        }
        System.out.println(pro);
    }
}
