package com.java.srv.leetcode;

public class SingleNumberTwo {
    public static void main(String[] args) {

        int nums[]={4,1,2,1,2,4};
        //4,1,2,1,2
        System.out.println( singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {

        int result=0;

        for(int i =0 ; i < nums.length ; i++){
            result = result^nums[i];
        }

        return result;

    }
}
