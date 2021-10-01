package com.java.srv.array;

public class countGivenNumber {
    public static void main(String[] args) {

        int a =12113162;
        int b;
        int c=0;
        int temp=a;
        int count=0;

        while (a!=0) {
            b = a % 10;
            a = a / 10;
            c =  b;

            if(c == 2) {

               count= count+1;
            }

        }

        System.out.print(count);
//        for (int i=0;i<=c;i++) {
//            System.out.print(i);
//        }

    }
}
