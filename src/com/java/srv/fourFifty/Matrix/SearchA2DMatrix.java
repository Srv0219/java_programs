package com.java.srv.fourFifty.Matrix;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        searchMatrix(matrix, target);
    }

    private static boolean searchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
