package com.java.srv.String;

public class knightProblem {
    public static void main(String[] args) {
        int n=5;
        int[][] arr = new int[n][n];
        int row=0;
        int col=0;
        int move=1;

        knightPrint(arr,row,col,move);

    }
    private static void print(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void knightPrint(int[][] arr, int row, int col, int move) {

        if(row<0||col<0||row>= arr.length||col>= arr.length||arr[row][col]>0){
            return;
        }
        else if(move == arr.length* arr.length){
          arr[row][col]=move;
            print(arr);
            arr[row][col]=0;
            return;
        }
         arr[row][col]=move;
        knightPrint(arr,row-2,col+1,move+1);
        knightPrint(arr,row-1,col+2,move+1);
        knightPrint(arr,row+1,col+2,move+1);
        knightPrint(arr,row+2,col+1,move+1);
        knightPrint(arr,row+2,col-1,move+1);
        knightPrint(arr,row+1,col-2,move+1);
        knightPrint(arr,row-1,col-2,move+1);
        knightPrint(arr,row-2,col-1,move+1);
        arr[row][col]=0;

    }
}
