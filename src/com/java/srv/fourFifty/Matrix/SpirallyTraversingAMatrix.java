package com.java.srv.fourFifty.Matrix;

import java.util.ArrayList;

public interface SpirallyTraversingAMatrix {
    public static void main(String[] args) {
        int arr[][] = {{6, 6, 2, 28, 2},
                {12, 26, 3, 28, 7},
                {22, 25, 3, 4, 23}};
        spiralTraversing(arr);
    }


    public static ArrayList<Integer> spiralTraversing(int[][] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        boolean arr2[][] = new boolean[arr.length][arr[0].length];


        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
                if (arr2[top][i] == false) {
                    al.add(arr[top][i]);
                    arr2[top][i] = true;
                }
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
                if (arr2[i][right] == false) {
                    al.add(arr[i][right]);
                    arr2[i][right] = true;
                }
            }
            right--;

            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
                if (arr2[bottom][i] == false) {
                    al.add(arr[bottom][i]);
                    arr2[bottom][i] = true;
                }
            }

            bottom--;

            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
                if (arr2[i][left] == false) {
                    al.add(arr[i][left]);
                    arr2[i][left] = true;
                }
            }
            left++;
        }
        for (int i : al) {
            System.out.println(i);
        }
        return al;
    }
}
