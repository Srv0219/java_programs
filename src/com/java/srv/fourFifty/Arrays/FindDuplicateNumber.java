package com.java.srv.fourFifty.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
       int[] nums = {1,3,4,2,2};
       findDuplicate(nums);
    }
    public static int findDuplicate(int[] nums) {
        int[] temp = new int[nums.length+1];

        for (int num : nums) {
            temp[num]++;
        }

        for (int i=0 ; i<temp.length ; i++) {
            if (temp[i] > 1) {
                return i;
            }
        }
        return 0;
    }
}
