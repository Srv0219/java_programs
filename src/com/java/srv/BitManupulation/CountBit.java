package com.java.srv.BitManupulation;

public class CountBit {
    public static void main(String[] args) {
        int n =11;
        citCount(n);
    }

    private static int citCount(int N) {
        int a;
        int count=0;

        while (N!=0){
            a=N%2;
            N=N/2;
            if (a==1){
                count++;
            }
        }
        return count;
    }
}
