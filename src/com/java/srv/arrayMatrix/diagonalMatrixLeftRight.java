package com.java.srv.arrayMatrix;

public class diagonalMatrixLeftRight {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        diagonalLeftRight(a);

    }

    private static void diagonalLeftRight(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (j + i == a.length - 1) {
                    System.out.println(a[i][j] + " ");
                }
            }
        }

//        for (int i = a.length - 1; i >= 0; i--) {
//            for (int j = a.length - 1; j >= 0; j--) {
//                if (i == j) {
//                    System.out.print(a[i][j]);
//                } else {
//                    System.out.print("");
//                }
//            }
//            System.out.println("");
//        }

    }
}
