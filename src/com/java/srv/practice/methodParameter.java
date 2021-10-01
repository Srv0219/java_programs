package com.java.srv.practice;

public class methodParameter {
    public static void main(String[] args) {

        methodParam(1);
    }

    private static void methodParam(int val) {
        int table;

        while (val<=10) {
            for (int i = 0; i <= 10; i++) {
                table = val * i;
                System.out.println(val + " * " + i + " = " + table);

            }
            System.out.println();
            val++;
        }

    }
}
