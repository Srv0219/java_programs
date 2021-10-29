package com.java.srv.fourFifty.Matrix;

public class SpecificPairInMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, -1, -4, -20},
                       {-8, -3, 4, 2, 1},
                       {3, 8, 6, 1, 3},
                       {-4, -1, 1, 7, -6},
                       {0, -4, 10, -5, 1}};



        long start = System.currentTimeMillis();
        pairInMatrix(mat);
        long end = System.currentTimeMillis();
        System.out.println("time takes " +
                (end - start) + " ms");
    }

    private static void pairInMatrix(int[][] arr) {
        int max=Integer.MIN_VALUE;

        for (int a = 0; a < arr.length-1; a++) {
            for (int b = 0; b < arr[0].length - 1; b++) {
                for (int d = a + 1; d < arr.length; d++) {
                    for (int e = b + 1; e < arr[0].length; e++) {
                        if (max < (arr[d][e] - arr[a][b])) {
                            max = arr[d][e] - arr[a][b];
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
