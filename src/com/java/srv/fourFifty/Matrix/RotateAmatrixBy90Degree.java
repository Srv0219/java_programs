package com.java.srv.fourFifty.Matrix;

public class RotateAmatrixBy90Degree {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        rotateNinety(arr);
    }

    private static void rotateNinety(int[][] arr) {
        int temp;
        //transpose
        for (int i=0;i< arr.length;i++){
            for (int j=i;j<arr[0].length;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }


        for (int i =0;i< arr.length;i++){
            int li=0;
            int ri= arr.length-1;
            while (li<ri){
                 temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }

    }
}
