package com.java.srv.fourFifty;

import java.util.Arrays;

public class NextPermutationTwo {
    public static void main(String[] args) {
        int nums[] = {1, 5, 8, 4, 7, 6, 5, 3, 1};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {

        int index = nums.length - 2;
        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }

        if (index == -1) {
            Arrays.sort(nums);
            return;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        Arrays.sort(nums, index + 1, nums.length);
    }
}
