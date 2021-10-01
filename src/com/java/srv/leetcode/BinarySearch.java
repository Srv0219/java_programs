package com.java.srv.leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6, 8};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }

    /*public static int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                System.out.println(i);
                break;
            } else {

                if (target > nums[nums.length-1]) {
                    result = nums.length-1 + 1;
                    break;

                } else if (target > nums[i] && target < nums[i + 1]) {
                    result = i + 1;
                    break;
                }
            }
        }

        return result;
    }*/
    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }

        }
        return nums.length;

    }
}


