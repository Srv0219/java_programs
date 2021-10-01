package com.java.srv.array;

public class armstrongNumber {
    public static void main(String[] args) {
       int a = 153;
       int b;
       int c = 0 ;
       int temp = a;
         while (a>0) {
             b = a%10;
             a = a/10;
             c = c + (b*b*b);
         }
        if(temp == c){
            System.out.print( "Armstrong Number");
        }
        else {
            System.out.print( "Not Armstrong Number");
        }
    }
}

