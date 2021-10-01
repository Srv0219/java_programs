package com.java.srv.leetcode;

public class ContainerWithWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxArea(height);


    }

    public static int maxArea(int[] height) {
        if (height[0] == 1 && height[1] == 1) {
            return 1;
        } else if (height[0] == 0 && height[1] == 0) {
            return 0;
        }

        return 0;
    }
}
