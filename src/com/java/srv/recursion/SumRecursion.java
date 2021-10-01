package com.java.srv.recursion;

public class SumRecursion {
    public static void main(String[] args) {
        int a=10;

        System.out.println(sumRecur(a));

    }

    private static int sumRecur(int a) {
        int multi;
        int pro=5;
        if (a==0){
            return 0 ;
        }
        sumRecur((a-1));
        multi=pro*a;
        System.out.println(pro+" * "+a+" = "+multi);
        return multi;

    }
}
