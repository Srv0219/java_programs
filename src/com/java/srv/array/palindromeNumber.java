package com.java.srv.array;

public class palindromeNumber {
    public static void main(String[] args) {

       int a =  121;
       int b ;
       int c =0 ;
       int temp =a;
    while (a!=0) {
        b = a % 10;
        a = a / 10;
        c = c*10+b;
    }
       if(temp==c){

           System.out.print("Armstrong");
       }
       else {
           System.out.print("not Armstrong");
       }


    }
}
