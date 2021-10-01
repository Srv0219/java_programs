package com.java.srv.arrayMatrix;

public class SnakeMatrix {

    public static void main(String[] args) {

        int[][] arr ={{1,2,3},
                     {4,5,6},
                     {7,8,9}};

       int[][] val = snakePrintMatrix(arr);
       for (int i=0;i< arr.length;i++){
           for (int j=0;j< arr[0].length;j++){
               System.out.print(val[i][j]+" ");
           }
           System.out.println();
       }
    }

    private static int [][] snakePrintMatrix(int[][] arr) {
        int i=0;
        int l =0;
        int row= arr.length;
        int col= arr[0].length;
        int[][] str =new int[row][col];
        boolean lr=true;

        while (i< arr.length){
           if(lr) {
               l=0;
               for (int j = 0; j < arr.length; j++) {
                   str[i][l] = arr[i][j];
                    l++;
               }
               i++;
           }
               else {
                   l=0;
                  for (int k=arr.length-1;k>=0;k--){
                       str[i][l] = arr[i][k];
                       l++;
                   }
               i++;
               }

               lr=!lr;
           }
        return str;
        }
    }

