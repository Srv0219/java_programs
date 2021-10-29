package com.java.srv.arrayMatrix;

public class rotateNinetyDegreeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int row = 3;

        rotateNinetyDegree(arr, row);
    }

    private static void rotateNinetyDegree(int[][] arr, int row) {

        for (int i = 0; i <= row; i++) {
            for (int j = row - 1; j >= 0; j--) {
                System.out.print(arr[j][i]);

            }
            System.out.println();


        }

    }
}


//        {00,01,02},
//        {10,11,12},
//        {20,21,22},
//