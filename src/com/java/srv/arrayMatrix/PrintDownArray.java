package com.java.srv.arrayMatrix;

public class PrintDownArray {

    public static void main(String[] args) {
        int[][] arr ={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        printDown(arr);
    }

    private static void printDown(int[][] arr) {
        int j=0;

        while (j<= arr.length){
            for(int i=0;i< arr[0].length;i++){
                System.out.println(arr[i][j]);
            }
            j++;
        }
    }
}
