package com.java.srv.arrayMatrix;

public class rotateAntiClockWise {
    public static void main(String[] args) {
        int[][] arr ={{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 10, 11, 12},
                     {13, 14, 15, 16}};
        int a =arr.length-1;
        int b=0;

        rotateAntiClockWisenumber(arr,a,b);
    }

    private static void rotateAntiClockWisenumber(int[][] arr, int a,int b) {
       int c=0;
        while(a>=0) {
            for (int i=a;i>=0;i--){
                System.out.println(arr[b][i]);
            }

            b++;
            for (int i=b;i<=a;i++){
                System.out.println(arr[i][c]);
            }
            for (int i=b;i<=a;i++){
                System.out.println(arr[a][i]);
            }
            b++;
            for (int i=b;i>0;i--){
                System.out.println(arr[i][a]);
            }

        }
    }
}
