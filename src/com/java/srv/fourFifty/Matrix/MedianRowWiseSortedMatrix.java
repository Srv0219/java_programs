package com.java.srv.fourFifty.Matrix;

public class MedianRowWiseSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 6},
                {2, 5, 9},
                {3, 6, 9}};
        medianOfMatrix(arr);
    }

    private static int medianOfMatrix(int[][] arr) {

        int n = (arr.length * arr[0].length) / 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (count == n) {
                    return arr[j][i];
                }
                count++;
            }
        }
        return 0;
    }
}
