package com.java.srv.array;

public class primeNumber {
    public static void main(String[] args) {
        int num=32;
        int count=0;
        for (int i=2;i<num-1;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count>0){
            System.out.println(num+" is not a prime no");
        }
        else {
            System.out.println(num+" is a prime no");
        }
    }
}
