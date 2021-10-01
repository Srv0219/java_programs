package com.java.srv.arrayMatrix;

public class transposeArray {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
        int[][] b = new int[4][4];
          //transpose method
        transpose t = new transpose();
        int [][] arr = t.transposeAlgo(a , b,n);
        for (int i=0;i< arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //-----------------------------------------------------------------------------------------------------------
        //sumMatrix method
        System.out.println("------ +");
        int add = 0;
        sumMatrixClass sum = new sumMatrixClass();
      int ans =  sum.sumMatrix(a,add);
      System.out.print(ans);


    }
}
