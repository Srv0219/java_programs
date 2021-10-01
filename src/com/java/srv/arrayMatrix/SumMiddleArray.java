package com.java.srv.arrayMatrix;

public class SumMiddleArray {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
       int s= sumMiddle(arr);
        System.out.println(s);
    }

    private static int sumMiddle(int[][] arr) {
        int sum=0;
        int j= arr.length/2;
        for(int i =0 ;i< arr.length;i++){
            sum=sum+arr[i][j];
        }
        for(int i =0 ;i< arr[0].length;i++){
            sum=sum+arr[j][i];
        }
        return sum;
    }
}
