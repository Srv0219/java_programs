package com.java.srv.matrix;

public class threeCrossTwo {
    public static void main(String[] args) {
        int[][] a ={{1,2,3},{1,2,3}};
        threeCrossTwoM(a);
    }

    private static void threeCrossTwoM(int[][] a) {
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }
}
