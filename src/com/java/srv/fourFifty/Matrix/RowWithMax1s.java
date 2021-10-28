package com.java.srv.fourFifty.Matrix;

public class RowWithMax1s {
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        rowWithMax1(arr);
    }

    private static int  rowWithMax1(int[][] arr) {
        int max=Integer.MIN_VALUE;
        int count=0;
        int row = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (arr[i][j]==1){
                    count++;
                }
            }
            if (count>max){
                row=i;
                max=count;
            }
            count=0;
        }
        return row;
    }
}
