package com.java.srv.practice;

import java.util.*;

public class ConvertZeroWith5 {
    public static void main(String[] args) {
        int n = 1004;
        convertFive(n);
    }

    private static void convertFive(int n) {
        int a;
        int b = 0;
       Stack<Integer> st= new Stack<>();
        while (n != 0) {
            a = n % 10;
            if (a == 0) {
                a = 5;
            }
            n = n / 10;
            st.push(a);
        }
        while (!st.isEmpty()) {
            b = b * 10 + st.pop();
        }
    }
}
