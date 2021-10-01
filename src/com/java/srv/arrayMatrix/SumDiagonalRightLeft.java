package com.java.srv.arrayMatrix;

public class SumDiagonalRightLeft {
    public static void main(String[] args) {
         int temp=0;
         int temp1=0;

        int[][] arr ={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        diagonalRightLeft(arr,temp,temp1);
    }

    private static void diagonalRightLeft(int[][] arr,int temp,int temp1) {
        int add;
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    temp=temp+arr[i][j];


                }

            }
        }


        for (int k=0;k< arr.length;k++){
            for(int l=0;l<arr[0].length;l++){
                if(l+k == arr.length-1){
                    temp1=temp1+arr[k][l];



                }

            }
        }

        add = temp+temp1;
        System.out.print(add);
    }
}
