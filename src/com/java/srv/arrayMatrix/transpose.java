package com.java.srv.arrayMatrix;

public class transpose {

    public int[][] transposeAlgo(int[][] a, int[][] b,int n) {
        for (int i=0;i<n;i++){
            for(int k=0;k<n;k++){

                b[i][k] = a[k][i];
            }
            }
        return b;
        }



    }

