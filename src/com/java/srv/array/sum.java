package com.java.srv.array;

public class sum {
    public static void main(String[] args) {
        int a =125;
        int b ;
        int c=0;

        while (a!=0){
            b=a%10;
            a=a/10;
            c = c + b;

        }
        System.out.println(c);
    }
}
