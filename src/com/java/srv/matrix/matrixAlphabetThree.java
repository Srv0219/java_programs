package com.java.srv.matrix;

public class matrixAlphabetThree {
    public static void main(String[] args) {
        char a ='A';
        matrixAlphabetTh(a);
    }

    private static void matrixAlphabetTh(char a) {
        int b=5;
        for (int i=0 ; i<b;i++){
            for (int j =0;j<=i;j++){
                System.out.print(a +" ");
            }
                   System.out.println();
        }
    }
}
