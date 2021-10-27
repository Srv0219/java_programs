package com.java.srv.fourFifty.Matrix;

import java.util.Arrays;

public class MedianRowWiseSortedMatrix {
    public static void main(String[] args) {
        int arr[][]={{1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};
        medianOfMatrix(arr);
    }

    private static void medianOfMatrix(int[][] arr) {

        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                System.out.println(arr[j][i]);
            }
        }
    }
}
