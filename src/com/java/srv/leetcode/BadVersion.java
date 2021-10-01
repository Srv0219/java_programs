package com.java.srv.leetcode;

public class BadVersion {


    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6, 8};

        int start = 0;
        int end = nums.length - 1;
        int n = 8;
        firstBadVersion(n, nums, start, end);

    }

    public static int firstBadVersion(int n, int[] nums, int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == n) {
                return mid;
            }
            if (nums[mid] < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return mid;
    }
}
