package com.java.srv.leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2;
        removeElement(nums, val);
    }

    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val && nums[i] <= val) {
                nums[i] = '_';
                count++;
            } else if (nums[i] > val) {
                break;
            } else {
                continue;
            }

        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return nums.length - count;


    }
}
