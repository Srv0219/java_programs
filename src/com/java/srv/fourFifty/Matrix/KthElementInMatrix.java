package com.java.srv.fourFifty.Matrix;

import java.util.Arrays;

public class KthElementInMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int k=3;
        findKthElement(arr,k);
    }

    private static int findKthElement(int[][] mat, int k) {
        int inc=0;
        int a[]= new int[mat.length*mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                a[inc]=mat[i][j];
                inc++;
            }
        }
        Arrays.sort(a);
        System.out.println(a[k-1]);
        return a[k-1];
    }
}
