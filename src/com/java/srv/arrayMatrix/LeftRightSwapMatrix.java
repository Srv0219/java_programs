package com.java.srv.arrayMatrix;

public class LeftRightSwapMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};


        leftRightSwap(arr);
    }

    private static void leftRightSwap(int[][] arr) {
        int col = 0;
        int row = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][col];
            arr[i][col] = arr[i][row];
            arr[i][row] = temp;
            //System.out.println( arr[i][row ]);
        }
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
