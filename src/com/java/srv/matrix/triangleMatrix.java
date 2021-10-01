package com.java.srv.matrix;

public class triangleMatrix {
    public static void main(String[] args) {
        int a =5;

        triangle(a);
    }

    private static void triangle(int a) {
        for (int i=0;i<a;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* "+" ");
            }
            System.out.println(" ");
        }
        for (int k=a-1;k>0;k--){

            for (int l=0;l<k;l++){
                System.out.print("* "+" ");
            }
            System.out.println(" ");

        }
    }
}
