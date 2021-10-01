package com.java.srv.matrix;

public class twoCrossThree {
    public static void main(String[] args) {
        int[][] a ={{0,1},{0,2},{0,3}};
        crossMatrix(a);
    }

    private static void crossMatrix(int[][] a) {

        for (int i=0;i<a.length;i++){

            for (int j=0;j<a[1].length;j++){

                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
