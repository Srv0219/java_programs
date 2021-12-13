package com.java.srv.recursion;

public class Log {
    public static void main(String[] args) {
        System.out.println(log(32));
    }

    private static int log(int i) {
        if (i == 1) {
            return 1;
        }

        int val = log(i / 2);
        val++;
        return val;
    }
}
