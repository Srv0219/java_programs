package com.java.srv.fourFifty.Arrays;

import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialsOfLargeNumbers {
    public static void main(String[] args) {
        int n = 10;
        factorialLargerNumber(n);
    }

    private static void factorialLargerNumber(int n) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        BigInteger sum = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        int val=sum.intValue();
        arrayList.add(val);
        System.out.println(val);
    }
}
