package com.java.srv.arrayMatrix;

public class rotateOneEightyDegreeMatrix {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row =3;


        rotateOneEightyDegree(arr,row);
        rotateOneEightyDegree(arr,row);
    }

    private static void rotateOneEightyDegree(int[][] arr, int row) {

        for (int i=0;i<=row;i++){
            for(int j=row-1;j>=0;j--){
                System.out.print(arr[j][i]);

            }
            System.out.println();


        }
    }

}
