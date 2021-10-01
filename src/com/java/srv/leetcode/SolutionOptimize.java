package com.java.srv.leetcode;

public class SolutionOptimize {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15}, target = 9;
        int ans[] = twoSum(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int disp[];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i >= nums.length) {
                    break;
                }

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;

    }

}
