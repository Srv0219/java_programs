package com.java.srv.array;

public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
        int[] arr ={-2,-3,4,-1,-2,1,5,-3};
        largestSum(arr);
    }

    private static void largestSum(int[] arr) {
        int max=Integer.MIN_VALUE;
        int str=0;
        for (int i=0;i< arr.length;i++){
            str=arr[i];
            System.out.println(str);
            for(int j=i+1;j< arr.length;j++){
                System.out.print(arr[j]);
                str=str+arr[j];
               System.out.println(" -> "+str);
                if (str>max)
                    max=str;
            }
            System.out.println("-------------------");
            str=0;


        }
        System.out.println("maximum value is :"+max);
    }
}
