package com.java.srv.fourFifty.Matrix;

public class SpecificPairInMatrix1 {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, -1, -4, -20},
                {-8, -3, 4, 2, 1},
                {3, 8, 6, 1, 3},
                {-4, -1, 1, 7, -6},
                {0, -4, 10, -5, 1}};
        pairInMatrix(mat);
    }


    private static void pairInMatrix(int[][] mat) {
        int inc=0;
        int arr[]= new int[mat.length* mat[0].length];
        for (int i=0;i< mat.length;i++){
            for (int j=0;j< mat[0].length;j++){
                arr[inc]=mat[i][j];
                inc++;
            }
        }
        int ass=10-(-8);
        System.out.println(ass);

        int max=Integer.MIN_VALUE;
        int sum;
    for (int i=0;i< arr.length;i++){
        for (int j=0;j< arr.length;j++){
           sum=arr[j]-arr[i];
           if(sum>max){
               max=sum;
           }
        }
    }
        System.out.println(max);
    }
}
