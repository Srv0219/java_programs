package com.java.srv.matrix;

public class pyramid {
    public static void main(String[] args) {

        int[][] a =new int[5][5];

        pyramidArr(a);
    }

    private static void pyramidArr(int[][] a) {
        for (int i = 0 ;i<a.length;i++){
            for(int j= 2*(a.length-i);j>0;j--){
                System.out.print(" ");
            }
            for(int k= 0;k<=i;k++){
                System.out.print("* "+" ");
            }
            System.out.println();
        }
    }
}
