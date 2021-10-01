package com.java.srv.array;

public class SearchNumber {
    public static void main(String[] args) {
        //1211316
        int a =0200306;
        int b;
        int c=0;
        int temp=a;


        while (a!=0) {
            b = a % 10;
            a = a / 10;
            c =  b;
        }
        System.out.print(c == 1);
    }
}
