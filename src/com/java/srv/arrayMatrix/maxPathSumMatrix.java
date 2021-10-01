package com.java.srv.arrayMatrix;

import static java.lang.Math.max;

public class maxPathSumMatrix {
//            1 2 3
//            9 8 7
//            4 5 6

//    00 01 02
//    10 11 12
//    20 21 22
public static void main(String[] args) {
    int[][] arr ={{1,2,3},
                 {9,8,7},
                 {4,5,6}};
    int max=Integer.MIN_VALUE;

    maxPathSum(arr,max);
}

    private static void maxPathSum(int[][] arr,int max) {

    int r=3;
    int c=3;
    int res=-1;
    for(int i=0;i<r;i++){
        res=Math.max(res,arr[0][i]);//doubt

    }
    for(int i=1;i<c;i++){
        res=-1;
        for(int j=1;j<r;j++){
            if (j>0&&j<r-1){
                arr[i][j]+=max(arr[i - 1][j],
                        max(arr[i - 1][j - 1],
                                arr[i - 1][j + 1]));
            }
            else if(j>0){
                arr[i][j] += max(arr[i - 1][j],
                        arr[i - 1][j - 1]);

            }
            else if (j < c - 1){
                arr[i][j] += max(arr[i - 1][j],
                        arr[i - 1][j + 1]);


            res = max(arr[i][j], res);

        }

        }


    }
        System.out.print(res);
    }
}
