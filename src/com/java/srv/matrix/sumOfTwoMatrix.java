package com.java.srv.matrix;

public class sumOfTwoMatrix {
    public static void main(String[] args) {

        int[][] a = {{0,1,2},{3,4,5}};
        int[][] b = {{0,1,2},{3,4,5}};
        int[][] c = new int[2][3];
        addMatrix(a,b,c);

    }

    private static void addMatrix(int[][] a, int[][] b, int[][]c) {

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println("--------");

       for (int x=0;x< b.length;x++){
            for (int y=0;y< b[0].length;y++){
               System.out.print(b[x][y] + " ");
            }

           System.out.println();
        }
        System.out.println("-------- +");
       for (int l = 0;l<a.length;l++){
           for (int n = 0;n<a[0].length;n++){

               c[l][n] =a[l][n] +b[l][n];
              System.out.print(c[l][n]+" ");

           }
           System.out.println();

       }


    }

}
