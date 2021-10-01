package com.java.srv.recursion;

public class FabonacciAdv {
    public static void main(String[] args) {
        int a=7;
        System.out.println(fabonacciPrint(a));

    }

    private static int fabonacciPrint(int a) {
        int add=0;
        if(a==0){
            return 0;
        }

         add= a+fabonacciPrint(a-1);
      //  System.out.println(a);

        System.out.println(add);
         return add;
    }
}
