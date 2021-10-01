package com.java.srv.practice;

public class tableMethod {
    public static void main(String[] args) {
        int table=0;
       // int a=methodParame(1,table) ;
        System.out.println(methodParame(1,table));
    }
    private static int methodParame(int val,int table) {


        while (val<=10) {
            for (int i = 0; i <= 10; i++) {
                table = val * i;
                System.out.println(val + " * " + i + " = " + table);

            }
            System.out.println();
            val++;
        }
    return table;
    }
}
