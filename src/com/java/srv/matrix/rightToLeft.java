package com.java.srv.matrix;

public class rightToLeft {
    public static void main(String[] args) {
        int a =5;
        rightToLeftPattern(a);
    }

    private static void rightToLeftPattern(int a) {
        for (int i =0;i<a;i++){
            for(int j=a-i;j<a;j++){
                System.out.print(" ");
            }
            for(int k =i;k<a;k++){
                System.out.print("* ");    //reverse pyramid &
            }
            System.out.println();
        }
    }
}
