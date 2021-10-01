package com.java.srv.leetcode;


public class BinarySearchFirstLastIndex {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 10};
        int target = 6;
        int val[] = searchRange(nums, target);
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }
    }

    public static int[] searchRange(int[] nums, int target) {

        //Default position initiated at -1

        int arr[] = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                arr[0] = i;
                break;
            }

        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (target == nums[i]) {
                arr[1] = i;
                break;
            }

        }


        //If target is not found in the array, return [-1, -1]
        if (arr[0] == -1 && arr[1] == -1) {
            return arr;
        }
        //If both target is  found in the array, return [ Index, Index]
        else if (arr[0] > -1 && arr[1] > -1) {
            return arr;
        }
        //If one target is  found in the array, return [ same Index, same Index]
        else if (arr[0] > -1 || arr[1] > -1) {
            arr[1] = arr[0];
        }


        return arr;

    }
}

