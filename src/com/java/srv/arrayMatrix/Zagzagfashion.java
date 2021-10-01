package com.java.srv.arrayMatrix;

public class Zagzagfashion {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
     int[] a = ZigZag.zagazagMethod(arr);
     for (int p =0 ;p<a.length;p++){
         System.out.print(a[p]+" ");
     }

    }

    static class ZigZag {
        private static int[] zagazagMethod(int[][] arr) {
            int row = 0;
            int col = 0;
            int m = arr.length;
            int n = arr[0].length;
            boolean up = true;
            int[] str = new int[m * n];
            int i = 0;

            while (row < m && col < n) {

                if (up) {
                    while (row > 0 && col < n - 1) {

                        str[i] = arr[row][col];
                        i++;
                        row--;
                        col++;
                       // System.out.print(str[i] + " ");
                    }
                    str[i++] = arr[row][col];
                    if (col == n - 1) {
                        row++;
                    } else {
                        col++;
                    }

                } else {
                    while (col > 0 && row < m - 1) {

                        str[i++] = arr[row][col];

                        row++;
                        col--;
                      //  System.out.print(str[i] + " ");
                    }
                    str[i++] = arr[row][col];
                    if (row == m - 1) {
                        col++;
                    } else {
                        row++;
                    }


                }

                up=!up;


            }
    return str;
        }


    }
}
//00 01 02 03
//10 11 12 13
//20 21 22 23
//30 31 32 33

//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
