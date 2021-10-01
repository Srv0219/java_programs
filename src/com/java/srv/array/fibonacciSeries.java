package com.java.srv.array;

public class fibonacciSeries {
    public static void main(String[] args) {

        int sum1 ;
        int sum2 = 0;
        int sum3 = 1;
    //add previous two value
        for (int i=0;i<=10;i++){

            sum1=sum2+sum3;
            sum2 = sum3;
            sum3 = sum1;
            System.out.print(sum1 + ",");


        }
    }
}
