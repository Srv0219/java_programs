package com.java.srv.hashing;

public class zorFunctionRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        System.out.println(zorFunction(arr));
    }

    private static int zorFunction(int[] arr) {
        int res=0;
       for (int i=0;i< arr.length-1;i++) {
           res = res ^ (i + 1) ^ arr[i];
           System.out.println(res);
       }
           res =res^arr[arr.length-1];


       return  res;
    }
}
