package com.java.srv.leetcode;

public class ContainerWithMostWaterTwo {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
     /*   int start = 0;
        int end = height.length - 1;
        int maxWater = 0;
        while (start < end) {
            int curWater = Math.min(height[start], height[end]) * (end - start);
            if (curWater > maxWater) {
                maxWater = curWater;
            }
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;*/
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = Math.min(height[right], height[left]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

}
