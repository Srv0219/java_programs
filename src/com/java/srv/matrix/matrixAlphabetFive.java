package com.java.srv.matrix;

public class matrixAlphabetFive {
    public static void main(String[] args) {
        char a ='A';
        int b =5;
        matrixPatternFive(a,b);
    }

    private static void matrixPatternFive(char a,int b ) {
        for(int i =0;i<b;i++){
            for(int j =0;j<=i;j++){
                System.out.print(a);
                a++;
            }
            a=65;
            System.out.println();
        }
    }
}
