package com.java.srv.fourFifty;

import java.util.ArrayList;

public class FactorialsOfLargeNumber2 {
    public static void main(String[] args) {
        int n = 10;
        factorialLargerNumber(n);
    }

    private static ArrayList<Integer> factorialLargerNumber(int n) {

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        int carry = 0;
        int val = 2;
        while (val <= n) {

            for (int i = result.size() - 1; i >= 0; i--) {

                int temp = result.get(i) * val + carry;
                result.set(i, temp % 10);
                carry = temp / 10;
            }
            while (carry != 0) {
                result.add(0, carry % 10);
                carry = carry / 10;
            }
            val++;

        }
        return result;
    }
}
