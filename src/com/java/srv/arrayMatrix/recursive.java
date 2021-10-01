package com.java.srv.arrayMatrix;

public class recursive {
    public static void main(String[] args) {
        int fact =10;

       int res= factorial(fact);
        System.out.println(res);
    }

    private static int factorial(int fact) {
        if(fact==0 || fact==1) {
            return 1;
        }
        else {
            return fact*factorial(fact-1);

        }

    }
}
