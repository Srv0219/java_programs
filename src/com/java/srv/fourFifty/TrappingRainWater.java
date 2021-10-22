package com.java.srv.fourFifty;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {3, 0, 0, 2, 0, 4};
        rainWater(arr);
    }

    private static void rainWater(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int max = 0;
        long sum = 0;
        int min;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            left[i] = max;
        }
        max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            max = Math.max(arr[i], max);
            right[i] = max;
        }

        for (int i = 0; i < arr.length; i++) {
            min=Math.min(left[i],right[i]);
            sum=sum+(min-arr[i]);
        }

        System.out.println(sum);
    }
}
