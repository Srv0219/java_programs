package com.java.srv.matrix;

public class matrix {

    public static void main(String[] args) {
        int[][] a = {{0,1},{2,3}};
        twodimensional(a);
    }

    private static void twodimensional(int[][] a) {
        for (int i =0;i< a.length;i++){
            for (int j =0;j< a.length;j++){
                System.out.print("a[i][j]"+ " ");
            }
            System.out.println();
        }
    }
}
