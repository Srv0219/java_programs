package com.java.srv.arrayMatrix;

public class islandsOfNumber {
    public static void main(String[] args) {
        int[][] arr ={{1, 1, 0, 0, 0},
                     {0, 1, 0, 0, 1},
                     {1, 0, 0, 1, 1},
                     {0, 0, 0, 0, 0},
                     {1, 0, 1, 0, 1}};
        int[][] chk =new int[4][4];

        islandsNumber(arr,chk);
    }

    private static void islandsNumber(int[][] arr, int[][] chk) {
        int count = 0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (arr[i][j]==1){
                    chk[i][j]= chk[i][j]+arr[i+1][j];
                    chk[i][j]= chk[i][j]+arr[i-1][j];
                    chk[i][j]=chk[i][j]+arr[i][j+1];
                    chk[i][j]=chk[i][j]+arr[i][j-1];
                     count++;
                }
            }
        }
    }
}


//            {00, 01, 02, 03, 04},
//            {10, 11, 12, 13, 14},
//            {20, 21, 22, 23, 24},
//            {30, 31, 32, 33, 34},
//            {40, 41, 42, 43, 44}
