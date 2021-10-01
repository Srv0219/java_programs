package com.java.srv.leetcode;

class Solution {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15}, target = 9;
        int ans[]=twoSum(nums,target);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
    public static  int[] twoSum(int[] nums, int target) {
        int add;
        int disp[]=new int[2];
        int val=0;

        for(int i=0;i<nums.length;i++){
          for (int j=i+1;j< nums.length;j++){
              if(i>=nums.length){
                  break;
              }

              add=nums[i]+nums[j];
              if(add==target){

                  disp[val]=i;
                  disp[val+1]=j;

              }
          }

        }
        return disp;

    }
}
