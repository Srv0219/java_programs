package com.java.srv.matrix;

public class leftRightUp {
    public static void main(String[] args) {
        int a = 5;

        leftToRightMatrix(a);
    }

    private static void leftToRightMatrix(int a) {
        for (int i =a ;i>0;i--){
            for(int j = i-1;j>=1;j--){
                System.out.print(".");
            }
            for(int k=i;k<=a;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
