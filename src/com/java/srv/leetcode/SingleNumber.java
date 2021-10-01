package com.java.srv.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[]={4,1,2,1,2};
        //4,1,2,1,2
        System.out.println( singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int val=0;
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hs.get(nums[i])== null){
                hs.put(nums[i],1);
            }
            else{
                hs.put(nums[i],hs.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> set :hs.entrySet()){
            if(set.getValue()==1){
                val =set.getKey();
            }
        }
        return val;
    }
}
