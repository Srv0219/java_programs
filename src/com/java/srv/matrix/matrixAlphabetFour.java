package com.java.srv.matrix;

public class matrixAlphabetFour {
    public static void main(String[] args) {
        char a ='A';
        matrixPatternFour(a);
    }

    private static void matrixPatternFour(char a) {
        int b = 5;

        for (int i=0;i<b;i++){
            for (int j =0;j<=i;j++){

                System.out.print(a +" ");

            }
            a++;
            System.out.println();
        }

    }
}
