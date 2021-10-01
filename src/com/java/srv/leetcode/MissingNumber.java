package com.java.srv.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {0,1};
        System.out.println(nums.length);



    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        if (nums.length==1){
            res=nums[0]+1;
            return res;
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != nums[i + 1] - 1) {
                    res = nums[i] + 1;
                    break;
                }
            }
        }
        return res;
    }
}
