package com.java.srv.leetcode;

public class ZeroEnd {
    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);

    }

    public static int[] moveZeroes(int[] nums) {
        int arr[] = new int[nums.length];
        if (nums.length == 0) {
            return nums;
        }
        int count = 0;

        for (int k = 0; k < arr.length; k++) {
            if (nums[k] != 0) {
                nums[count] = nums[k];
                count++;
            }

        }
        while (count < arr.length) {
            nums[count] = 0;
            count++;
        }

        return nums;

    }
}
