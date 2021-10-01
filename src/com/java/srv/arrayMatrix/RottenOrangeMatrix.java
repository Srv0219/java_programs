package com.java.srv.arrayMatrix;

public class RottenOrangeMatrix {
    public static void main(String[] args) {
        int[][] arr ={{2,1,1},
                     {1,1,0},
                     {0,1,1}};
        int a = rottenOrange(arr);
        System.out.println(a);

    }

    private static int rottenOrange(int[][] arr) {
        int time=0;
       for(int i=0;i< arr.length;i++){
           for (int j=0;j< arr[0].length;j++){
               if(arr[i][j]==2 ){

                   if ( indexFlag(i,j+1,arr)&& arr[i][j+1]==1 ){
                       time++;
                       arr[i][j+1]=2;
                   }

                   if ( indexFlag(i-1,j,arr) && arr[i-1][j]==1  ){
                       time++;
                       arr[i-1][j]=2;
                   }

                   if ( indexFlag(i,j-1,arr) && arr[i][j-1]==1 ){
                       time++;
                       arr[i][j-1]=2;
                   }

                   if ( indexFlag(i+1,j,arr) && arr[i+1][j]==1){
                       time++;
                       arr[i+1][j]=2;
                   }
               }
           }
       }
        return time;
    }


    public static boolean indexFlag(int i ,int j , int [][] arr){
        return i >= 0 && j >= 0 && i < arr.length && j < arr[0].length;
    }
}
