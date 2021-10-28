package com.java.srv.fourFifty.Matrix;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int Mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        sortedMatrix(Mat);
    }

    private static void sortedMatrix(int[][] mat) {
        int inc = 0;
        int arr1[] = new int[mat.length * mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                arr1[inc] = mat[i][j];
                inc++;
            }
        }
        Arrays.sort(arr1);
        inc = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = arr1[inc];
                inc++;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
