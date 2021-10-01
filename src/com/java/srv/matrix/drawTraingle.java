package com.java.srv.matrix;

public class drawTraingle {
    public static void main(String[] args) {
       // int a [][]= new int[5][5];
        int a =5;
        drawPattern(a);
    }

    private static void drawPattern(int a) {
        for (int i =a ; i>=0;--i){
            for(int j=0 ; j<=i;j++){

                System.out.print("* "+" ");
            }
             System.out.println();
        }

    }
}
