package com.java.srv.matrix;

public class rightToLeftMatrix {
    public static void main(String[] args) {
        int a =5;
        rightToLeft(a);
    }

    private static void rightToLeft(int a) {
        for(int i=a;i>0;i--){

            for (int j=0;j<i-1;j++){
                System.out.print(" ");
            }
            for (int k=i;k<=a;k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
