package com.java.srv.leetcode;

public class BinarySearchTwoSameElement {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target =6;
       int val[] =searchRange(nums, target);
       for (int i=0;i< val.length;i++){
           System.out.println(val[i]);
       }
    }

    public static int[] searchRange(int[] nums, int target) {

        //Default position initiated at -1
        int[] ans = {-1, -1};

        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(target < nums[mid]){
                r = mid - 1;
            } else if(target > nums[mid]){
                l = mid + 1;
            }else{
                //Target found
                int start = mid;
                int end = mid;

                //Move to starting target position
                while((start > 0) && (nums[start - 1] == target)) start--;

                //Move to ending target position
                while((end < nums.length - 1) && (nums[end + 1] == target)) end++;

                //Update start and end position
                ans[0] = start;
                ans[1] = end;

                //Stop loop
                break;
            }
        }

        return ans;
    }
}
