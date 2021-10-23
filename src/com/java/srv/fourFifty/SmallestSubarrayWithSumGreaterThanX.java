package com.java.srv.fourFifty;

public class SmallestSubarrayWithSumGreaterThanX {
    public static void main(String[] args) {
        int A[] = {1, 10, 5, 2, 7};
        int x = 9;
        subarraySumGreaterThanX(A, x);

    }

    private static int subarraySumGreaterThanX(int[] arr, int x) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int y = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            y = i;
            while (sum < x && y < arr.length) {
                sum = sum + arr[y];
                y++;
                count++;
            }
            y = 0;
            if (min > count && sum > x) {
                min = count;
            }
            count = 0;
        }
        System.out.println(min);
        return min;
    }
}
