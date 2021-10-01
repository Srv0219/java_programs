package com.java.srv.matrix;

public class matrixAlphabet {
    public static void main(String[] args) {

        char a ='A';

        patternAlphabet(a);
    }

    private static void patternAlphabet(char a) {
        int b = 5;
        for (int i=0;i<b;i++) {

            for(int j=0;j<=i;j++) {

                System.out.print(a++ +" ");

            }
            System.out.println();
           // a++;
        }

    }
}
