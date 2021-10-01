package com.java.srv.practice;

public class methodOverloading {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        double x=10.81d;
        double y=20.81d;
       int plus = methodOverload(a,b);
       double product = methodOverload(x,y);

        System.out.println(plus);
        System.out.println(product);
    }

     private  static int methodOverload(int a, int b) {
        return  a+b;
    }
     private static double methodOverload(double x, double y) {
        return  x*y;
    }
}
