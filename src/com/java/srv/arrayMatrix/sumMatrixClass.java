package com.java.srv.arrayMatrix;

public class sumMatrixClass {

    public int sumMatrix(int[][] a,int add) {

        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){

                add=add+a[i][j];
            }
        }
        return add;
    }
}
