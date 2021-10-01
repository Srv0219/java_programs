package com.java.srv.leetcode;

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "6913259244";
        String num2 = "71103343";

        multiplyString(num1, num2);
    }

    private static String multiplyString(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        String multiply = "0";
        if (b1.equals("0") && b2.equals("0")) {
            return "0";
        } else {

            multiply = String.valueOf(b1.multiply(b2));
        }

        System.out.println(multiply);
        return multiply;
    }
}
