package com.java.srv.array;

public class swapNumber {
    public static void main(String[] args) {
        int a =12;
        int b ;
        int c=0;

        while (a!=0){
            b=a%10;
            a=a/10;
            c = b;
            b= a ;

            System.out.println(c);
        }
    }
}
