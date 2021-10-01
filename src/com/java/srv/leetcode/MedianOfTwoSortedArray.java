package com.java.srv.leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1, 2};
        int nums2[] = {3, 4};
        int length = nums1.length + nums2.length;
        int c[] = new int[length];
        System.arraycopy(nums1, 0, c, 0, nums1.length);
        System.arraycopy(nums2, 0, c, nums1.length, nums2.length);
        Arrays.sort(c);
        medianArray(c);
    }

    private static double medianArray(int[] c) {
        double add;
        int mid = c.length / 2;
        if (c.length % 2 == 0) {
            add = (c[mid - 1] + c[mid]) / 2f;
        } else {
            return c[mid];
        }
        System.out.println(add);
        return add;

        /*
            int start = 0;
        int end = c.length - 1;
        int mid = start + (end-start)/2;
        if (c.length%2==1) {
            System.out.println(c[mid]);
            return c[mid];
        }
        else {
            double med = (c[mid] + c[mid+1])/2f;
            System.out.println(med);
            return med;
        }
        */
    }
}
