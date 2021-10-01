package com.java.srv.matrix;

public class drawLeftTriangle {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        drawPattern(a);
    }

    private static void drawPattern(int[][] a) {
        for (int i = 0 ; i< a.length;i++){
            for(int j = 0;j<=i;j++){

                System.out.print("* "+" ");
            }
            System.out.println();
        }

    }
}
