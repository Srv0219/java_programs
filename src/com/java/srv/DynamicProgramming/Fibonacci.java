package com.java.srv.DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;

        System.out.println(fibbMemo(n));
    }

    private static int fibbMemo(int n) {
        int qb[]=new int[n+1];
        if (n==0 || n==1){
            return n;
        }
        if (qb[n]!=0){
            return qb[n];
        }
        int fibb1=fibbMemo(n-1);
        int fibb2=fibbMemo(n-2);
        int fibb=fibb1+fibb2;

        qb[n]=fibb;
        return fibb;
    }
}
