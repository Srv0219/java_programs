package com.java.srv.array;

public class sumOfNumberInArray {
    public static void main(String[] args) {
         int sum = 0 ;
        int[] arr = {1,2,3,4};
        for(int i=0;i< arr.length;i++){
            System.out.println("i :"+i);
              sum = sum + arr[i];
           System.out.println("sum : " +sum );

        }

    }
}
