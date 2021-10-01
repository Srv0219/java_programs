package com.java.srv.String;

public class QueenProblem {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int row =0;
        String ans="";
        queenSolution(arr,ans,row);
    }

    private static void queenSolution(int[][] arr,String ans,int row) {
        if(row == arr.length){
            System.out.println(ans);
        }

        for (int col=0;col< arr.length;col++){
            if(isSafe(arr,row,col)==true) {
                arr[row][col] = 1;
                queenSolution(arr, ans + row + col + ",", row + 1);
                arr[row][col] = 0;
            }
        }
    }


    private static boolean isSafe(int[][] arr,int row,int col) {

        for (int i =row-1,j=col;i>=0;i--){
            if (arr[i][j]==1){
                return false;
            }
        }
        for (int i =row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if (arr[i][j]==1){
                return false;
            }
        }
        for (int i =row-1,j=col+1;i>=0 && j< arr.length;i--,j++){
            if (arr[i][j]==1){
                return false;
            }
        }
  return true;
    }
}
