package com.java.srv.leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = {2, 3, 4, 5, 18, 17, 6};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minVal = Math.min(height[i], height[j]);
                int diff = j - i;
                ans = minVal * diff;
            }
            max = Math.max(ans, max);
        }

        return max;
    }
}
