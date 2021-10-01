package com.java.srv.arrayMatrix;

public class UpDownSwapMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};


        int[][] p =upDownSwap(arr);
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){

                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] upDownSwap(int[][] arr) {
        int row=0;
        int col= arr.length-1;
                for(int j=0;j< arr.length;j++){
                    int temp=arr[row][j];
                    arr[row][j]=arr[col][j];
                    arr[col][j]=temp;
                }
                return arr;
    }
}
