package com.java.srv.fourFifty.Matrix;

public class MaxRectangle2 {
    public static void main(String[] args) {
        int M[][] = {{0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}};
        maxRectangle(M);
    }

    private static void maxRectangle(int[][] arr) {
        int count = 0;
        int mul = 0;
        int max = 0;
        int val = 0;
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i > 0) {
                    if (arr[i][j] == 0) {
                        arr1[j] = 0;
                    } else {
                        arr1[j] = arr[i][j] + arr1[j];
                    }
                } else {
                    arr1[j] = arr[i][j];
                }
            }

            for (int j = 0; j < arr1.length; j++) {
                for (int k = j; k < arr1.length; k++) {

                    if (arr1[j] <= arr1[k] && arr1[j] != 0) {
                        val = arr1[j];
                        count++;
                    } else if (arr1[j] == 0) {
                        break;
                    }
                }
                mul = count * val;
                if (mul > max) {
                    max = mul;
                }
                count = 0;
            }
        }

        System.out.println(max);
    }
}
